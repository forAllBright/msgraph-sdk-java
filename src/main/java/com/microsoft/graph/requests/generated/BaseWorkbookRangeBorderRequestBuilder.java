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
 * The class for the Base Workbook Range Border Request Builder.
 */
public class BaseWorkbookRangeBorderRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookRangeBorderRequestBuilder {

    /**
     * The request builder for the WorkbookRangeBorder
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeBorderRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return The IWorkbookRangeBorderRequest instance
     */
    public IWorkbookRangeBorderRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions The options for this request
     * @return The IWorkbookRangeBorderRequest instance
     */
    public IWorkbookRangeBorderRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookRangeBorderRequest(getRequestUrl(), getClient(), requestOptions);
    }

}
