// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IIosManagedAppProtectionRequest;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionRequest;
import com.microsoft.graph.requests.extensions.IManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyDeploymentSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyDeploymentSummaryRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios Managed App Protection Request Builder.
 */
public class BaseIosManagedAppProtectionRequestBuilder extends BaseRequestBuilder implements IBaseIosManagedAppProtectionRequestBuilder {

    /**
     * The request builder for the IosManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseIosManagedAppProtectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IIosManagedAppProtectionRequest instance
     */
    public IIosManagedAppProtectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIosManagedAppProtectionRequest instance
     */
    public IIosManagedAppProtectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new IosManagedAppProtectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagedMobileAppCollectionRequestBuilder apps() {
        return new ManagedMobileAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("apps"), getClient(), null);
    }

    public IManagedMobileAppRequestBuilder apps(final String id) {
        return new ManagedMobileAppRequestBuilder(getRequestUrlWithAdditionalSegment("apps") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedAppPolicyDeploymentSummary
     *
     * @return the IManagedAppPolicyDeploymentSummaryRequestBuilder instance
     */
    public IManagedAppPolicyDeploymentSummaryRequestBuilder deploymentSummary() {
        return new ManagedAppPolicyDeploymentSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deploymentSummary"), getClient(), null);
    }
}

