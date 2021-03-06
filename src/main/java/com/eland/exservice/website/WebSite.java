/*
 * Copyright © 2017 Yan Zhenjie.
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
package com.eland.exservice.website;

import com.eland.exservice.RequestHandler;

import org.apache.httpcore.HttpException;
import org.apache.httpcore.HttpRequest;
import org.apache.httpcore.protocol.HttpContext;

import java.io.IOException;

/**
 * <p>
 * Registration website interface.
 * </p>
 * Created by Yan Zhenjie on 2017/3/15.
 */
public interface WebSite extends RequestHandler {

    boolean intercept(HttpRequest request, HttpContext context) throws HttpException, IOException;
}