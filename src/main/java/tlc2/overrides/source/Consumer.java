/*
 * Copyright 2020-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tlc2.overrides.source;

import tlc2.value.IValue;

import java.io.IOException;

/**
 * Source consumer.
 */
public interface Consumer {
    /**
     * Returns the consumer offset.
     *
     * @return the consumer offset
     */
    long offset();

    /**
     * Consumes the next value.
     *
     * @return the consumed value
     */
    IValue next() throws IOException;

    /**
     * Closes the consumer.
     */
    void close();
}
