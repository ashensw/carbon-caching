/*
 *  Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.carbon.caching;

import javax.cache.Caching;
import javax.cache.spi.CachingProvider;

/**
 * This OSGi service indicates that the CarbonCaching bundle is ready to provide caching services to the
 * rest of the platform.
 */
public class CarbonCachingService {

    /**
     * Returns the registered CachingProvider.
     *
     * @return the registered CachingProvider
     */
    public CachingProvider getCachingProvider() {
        return Caching.getCachingProvider();
    }

    /**
     * Returns the registered CachingProvider.
     *
     * @param classLoader the {@link ClassLoader} to load the
     *                    {@link CachingProvider}
     * @return the registered CachingProvider
     */
    public CachingProvider getCachingProvider(ClassLoader classLoader) {
        return Caching.getCachingProvider(classLoader);
    }

    /**
     * Returns the registered CachingProvider.
     *
     * @param fullyQualifiedClassName the fully qualified class name of the
     *                                {@link CachingProvider}
     * @return the registered CachingProvider
     */
    public CachingProvider getCachingProvider(String fullyQualifiedClassName) {
        return Caching.getCachingProvider(fullyQualifiedClassName);
    }

    /**
     * Returns the registered CachingProvider.
     *
     * @param fullyQualifiedClassName the fully qualified class name of the
     *                                {@link CachingProvider}
     * @param classLoader             the {@link ClassLoader} to load the
     *                                {@link CachingProvider}
     * @return the registered CachingProvider
     */
    public CachingProvider getCachingProvider(String fullyQualifiedClassName, ClassLoader classLoader) {
        return Caching.getCachingProvider(fullyQualifiedClassName, classLoader);
    }

}
