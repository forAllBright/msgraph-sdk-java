// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Onenote Request Builder.
 */
public class BaseOnenoteRequestBuilder extends BaseRequestBuilder implements IBaseOnenoteRequestBuilder {

    /**
     * The request builder for the Onenote
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseOnenoteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return The IOnenoteRequest instance
     */
    public IOnenoteRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions The options for this request
     * @return The IOnenoteRequest instance
     */
    public IOnenoteRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new OnenoteRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public INotebookCollectionRequestBuilder notebooks() {
        return new NotebookCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("notebooks"), getClient(), null);
    }

    public INotebookRequestBuilder notebooks(final String id) {
        return new NotebookRequestBuilder(getRequestUrlWithAdditionalSegment("notebooks") + "/" + id, getClient(), null);
    }
    public IOnenoteSectionCollectionRequestBuilder sections() {
        return new OnenoteSectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sections"), getClient(), null);
    }

    public IOnenoteSectionRequestBuilder sections(final String id) {
        return new OnenoteSectionRequestBuilder(getRequestUrlWithAdditionalSegment("sections") + "/" + id, getClient(), null);
    }
    public ISectionGroupCollectionRequestBuilder sectionGroups() {
        return new SectionGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sectionGroups"), getClient(), null);
    }

    public ISectionGroupRequestBuilder sectionGroups(final String id) {
        return new SectionGroupRequestBuilder(getRequestUrlWithAdditionalSegment("sectionGroups") + "/" + id, getClient(), null);
    }
    public IOnenotePageCollectionRequestBuilder pages() {
        return new OnenotePageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("pages"), getClient(), null);
    }

    public IOnenotePageRequestBuilder pages(final String id) {
        return new OnenotePageRequestBuilder(getRequestUrlWithAdditionalSegment("pages") + "/" + id, getClient(), null);
    }
    public IOnenoteResourceCollectionRequestBuilder resources() {
        return new OnenoteResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("resources"), getClient(), null);
    }

    public IOnenoteResourceRequestBuilder resources(final String id) {
        return new OnenoteResourceRequestBuilder(getRequestUrlWithAdditionalSegment("resources") + "/" + id, getClient(), null);
    }
    public IOnenoteOperationCollectionRequestBuilder operations() {
        return new OnenoteOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    public IOnenoteOperationRequestBuilder operations(final String id) {
        return new OnenoteOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
}
