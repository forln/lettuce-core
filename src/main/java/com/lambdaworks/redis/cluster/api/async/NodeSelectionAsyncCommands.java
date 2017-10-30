/*
 * Copyright 2011-2018 the original author or authors.
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
package com.lambdaworks.redis.cluster.api.async;

import com.lambdaworks.redis.cluster.api.NodeSelectionSupport;
import com.lambdaworks.redis.cluster.api.sync.NodeSelectionStreamCommands;

/**
 * Asynchronous and thread-safe Redis API to execute commands on a {@link NodeSelectionSupport}.
 *
 * @author Mark Paluch
 */
public interface NodeSelectionAsyncCommands<K, V> extends BaseNodeSelectionAsyncCommands<K, V>,
        NodeSelectionHashAsyncCommands<K, V>, NodeSelectionHLLAsyncCommands<K, V>, NodeSelectionKeyAsyncCommands<K, V>,
        NodeSelectionListAsyncCommands<K, V>, NodeSelectionScriptingAsyncCommands<K, V>,
        NodeSelectionServerAsyncCommands<K, V>, NodeSelectionSetAsyncCommands<K, V>, NodeSelectionSortedSetAsyncCommands<K, V>,
        NodeSelectionStringAsyncCommands<K, V>, NodeSelectionGeoAsyncCommands<K, V>, NodeSelectionStreamCommands<K, V> {

}
