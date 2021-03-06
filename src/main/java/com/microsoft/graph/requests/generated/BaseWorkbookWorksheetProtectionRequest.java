// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetProtectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetProtectionRequest;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtection;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Worksheet Protection Request.
 */
public class BaseWorkbookWorksheetProtectionRequest extends BaseRequest implements IBaseWorkbookWorksheetProtectionRequest {

    /**
     * The request for the WorkbookWorksheetProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWorkbookWorksheetProtectionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<WorkbookWorksheetProtection> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookWorksheetProtection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookWorksheetProtection> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookWorksheetProtection from the service
     *
     * @return the WorkbookWorksheetProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookWorksheetProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WorkbookWorksheetProtection> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookWorksheetProtection with a source
     *
     * @param sourceWorkbookWorksheetProtection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookWorksheetProtection sourceWorkbookWorksheetProtection, final ICallback<WorkbookWorksheetProtection> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookWorksheetProtection);
    }

    /**
     * Patches this WorkbookWorksheetProtection with a source
     *
     * @param sourceWorkbookWorksheetProtection the source object with updates
     * @return the updated WorkbookWorksheetProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookWorksheetProtection patch(final WorkbookWorksheetProtection sourceWorkbookWorksheetProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookWorksheetProtection);
    }

    /**
     * Creates a WorkbookWorksheetProtection with a new object
     *
     * @param newWorkbookWorksheetProtection the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookWorksheetProtection newWorkbookWorksheetProtection, final ICallback<WorkbookWorksheetProtection> callback) {
        send(HttpMethod.POST, callback, newWorkbookWorksheetProtection);
    }

    /**
     * Creates a WorkbookWorksheetProtection with a new object
     *
     * @param newWorkbookWorksheetProtection the new object to create
     * @return the created WorkbookWorksheetProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookWorksheetProtection post(final WorkbookWorksheetProtection newWorkbookWorksheetProtection) throws ClientException {
        return send(HttpMethod.POST, newWorkbookWorksheetProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookWorksheetProtectionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookWorksheetProtectionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookWorksheetProtectionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookWorksheetProtectionRequest)this;
     }

}

