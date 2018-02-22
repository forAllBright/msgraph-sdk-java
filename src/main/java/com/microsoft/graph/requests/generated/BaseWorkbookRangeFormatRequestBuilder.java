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
 * The class for the Base Workbook Range Format Request Builder.
 */
public class BaseWorkbookRangeFormatRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookRangeFormatRequestBuilder {

    /**
     * The request builder for the WorkbookRangeFormat
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeFormatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return The IWorkbookRangeFormatRequest instance
     */
    public IWorkbookRangeFormatRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions The options for this request
     * @return The IWorkbookRangeFormatRequest instance
     */
    public IWorkbookRangeFormatRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookRangeFormatRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookRangeBorderCollectionRequestBuilder borders() {
        return new WorkbookRangeBorderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("borders"), getClient(), null);
    }

    public IWorkbookRangeBorderRequestBuilder borders(final String id) {
        return new WorkbookRangeBorderRequestBuilder(getRequestUrlWithAdditionalSegment("borders") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookRangeFill.
     *
     * @return The IWorkbookRangeFillRequestBuilder instance
     */
    public IWorkbookRangeFillRequestBuilder fill() {
        return new WorkbookRangeFillRequestBuilder(getRequestUrlWithAdditionalSegment("fill"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookRangeFont.
     *
     * @return The IWorkbookRangeFontRequestBuilder instance
     */
    public IWorkbookRangeFontRequestBuilder font() {
        return new WorkbookRangeFontRequestBuilder(getRequestUrlWithAdditionalSegment("font"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookFormatProtection.
     *
     * @return The IWorkbookFormatProtectionRequestBuilder instance
     */
    public IWorkbookFormatProtectionRequestBuilder protection() {
        return new WorkbookFormatProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("protection"), getClient(), null);
    }

    public IWorkbookRangeFormatAutofitColumnsRequestBuilder autofitColumns() {
        return new WorkbookRangeFormatAutofitColumnsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.autofitColumns"), getClient(), null);
    }

    public IWorkbookRangeFormatAutofitRowsRequestBuilder autofitRows() {
        return new WorkbookRangeFormatAutofitRowsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.autofitRows"), getClient(), null);
    }
}
