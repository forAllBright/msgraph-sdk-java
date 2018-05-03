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
 * The interface for the Base Activity History Item Request.
 */
public interface IBaseActivityHistoryItemRequest extends IHttpRequest {

    /**
     * Gets the ActivityHistoryItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ActivityHistoryItem> callback);

    /**
     * Gets the ActivityHistoryItem from the service
     *
     * @return the ActivityHistoryItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ActivityHistoryItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ActivityHistoryItem with a source
     *
     * @param sourceActivityHistoryItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ActivityHistoryItem sourceActivityHistoryItem, final ICallback<ActivityHistoryItem> callback);

    /**
     * Patches this ActivityHistoryItem with a source
     *
     * @param sourceActivityHistoryItem the source object with updates
     * @return the updated ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ActivityHistoryItem patch(final ActivityHistoryItem sourceActivityHistoryItem) throws ClientException;

    /**
     * Posts a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ActivityHistoryItem newActivityHistoryItem, final ICallback<ActivityHistoryItem> callback);

    /**
     * Posts a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the new object to create
     * @return the created ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ActivityHistoryItem post(final ActivityHistoryItem newActivityHistoryItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseActivityHistoryItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseActivityHistoryItemRequest expand(final String value);

}
