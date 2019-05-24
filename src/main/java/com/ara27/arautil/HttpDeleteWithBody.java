package com.ara27.arautil;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;

class HttpDeleteWithBody extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "DELETE";

    public HttpDeleteWithBody(final String uri) {
        super();
        setURI(URI.create(uri));
    }

    public HttpDeleteWithBody(final URI uri) {
        super();
        setURI(uri);
    }

    public HttpDeleteWithBody() {
        super();
    }

    public String getMethod() {
        return METHOD_NAME;
    }

    public String[] sendDelete(String URL, String PARAMS, String header) throws IOException {
        String[] restResponse = new String[2];
        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpDeleteWithBody httpDelete = new HttpDeleteWithBody(URL);
        StringEntity input = new StringEntity(PARAMS, ContentType.APPLICATION_JSON);
        httpDelete.addHeader("Authorization", header);
        httpDelete.addHeader("Content-Type", "application/json");
        httpDelete.setEntity(input);

        CloseableHttpResponse response = httpclient.execute(httpDelete);
        restResponse[0] = Integer.toString((response.getStatusLine().getStatusCode()));
        restResponse[1] = EntityUtils.toString(response.getEntity());
        return restResponse;
    }
}