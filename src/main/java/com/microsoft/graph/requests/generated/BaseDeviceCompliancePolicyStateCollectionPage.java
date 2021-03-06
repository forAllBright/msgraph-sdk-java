// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyState;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance Policy State Collection Page.
 */
public class BaseDeviceCompliancePolicyStateCollectionPage extends BaseCollectionPage<DeviceCompliancePolicyState, IDeviceCompliancePolicyStateCollectionRequestBuilder> implements IBaseDeviceCompliancePolicyStateCollectionPage {

    /**
     * A collection page for DeviceCompliancePolicyState
     *
     * @param response the serialized BaseDeviceCompliancePolicyStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseDeviceCompliancePolicyStateCollectionPage(final BaseDeviceCompliancePolicyStateCollectionResponse response, final IDeviceCompliancePolicyStateCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
