// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.Windows10EnterpriseModernAppManagementConfiguration;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWindows10EnterpriseModernAppManagementConfigurationRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Windows10Enterprise Modern App Management Configuration Request.
 */
public class Windows10EnterpriseModernAppManagementConfigurationRequest extends BaseWindows10EnterpriseModernAppManagementConfigurationRequest implements IWindows10EnterpriseModernAppManagementConfigurationRequest {

    /**
     * The request for the Windows10EnterpriseModernAppManagementConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10EnterpriseModernAppManagementConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10EnterpriseModernAppManagementConfiguration.class);
    }
}
