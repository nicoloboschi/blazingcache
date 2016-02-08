/*
 * Copyright 2016 Diennea S.R.L..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package blazingcache.client.management;

import blazingcache.client.CacheClient;

/**
 * BlazingCache client status on JMX.
 *
 * @author matteo.casadei
 * @since 1.4.2
 *
 */
public class BlazingCacheClientStatusMXBean implements CacheClientStatusMXBean {

    /**
     * the cache client the provided statistics refers to.
     */
    private final CacheClient client;

    /**
     * Construct a new MXBean to publish client status on JMX.
     *
     * @param client
     *            the {@see CacheClient} instance the status published by this
     *            MXBean refers to
     */
    public BlazingCacheClientStatusMXBean(final CacheClient client) {
        this.client = client;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getCurrentTimestamp() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getLastConnectionToServerTimestamp() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isClientConnected() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getCacheConfiguredMaxMemory() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getCacheUsedMemory() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getCacheNumberOfKeys() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getCacheOldestKeyTimestamp() {
        // TODO Auto-generated method stub
        return 0;
    }

}
