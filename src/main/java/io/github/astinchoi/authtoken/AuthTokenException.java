/*
* Author: Astin Choi <achoi@akamai.com>

* Copyright 2017 Akamai Technologies http://developer.akamai.com.

* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at

*     http://www.apache.org/licenses/LICENSE-2.0

* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package io.github.astinchoi.authtoken;


/**
 * {@link AuthToken} exception class
 */
public class AuthTokenException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * @param msg exception message
     */
    public AuthTokenException(String msg) {
        super(msg);
    }
}