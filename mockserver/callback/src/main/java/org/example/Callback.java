package org.example;

import org.mockserver.mock.action.ExpectationResponseCallback;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;

public class Callback implements ExpectationResponseCallback {

    public HttpResponse handle(HttpRequest httpRequest) {
        return new HttpResponse().withBody("callback").withStatusCode(200);
    }
}
