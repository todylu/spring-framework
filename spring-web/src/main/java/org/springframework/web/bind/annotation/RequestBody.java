/*
 * Copyright 2002-2012 the original author or authors.
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

package org.springframework.web.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.http.converter.HttpMessageConverter;

/**
 * Annotation indicating a method parameter should be bound to the body of the web request.
 * The body of the request is passed through an {@link HttpMessageConverter} to resolve the
 * method argument depending on the content type of the request. Optionally, automatic
 * validation can be applied by annotating the argument with {@code @Valid}.
 *
 * <p>Supported for annotated handler methods in Servlet environments.
 *
 * @author Arjen Poutsma
 * @see RequestHeader
 * @see ResponseBody
 * @see org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter
 * @see org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter
 * @since 3.0
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestBody {

	/**
	 * Whether body content is required.
	 * <p>Default is <code>true</code>, leading to an exception thrown in case
	 * there is no body content. Switch this to <code>false</code> if you prefer
	 * <code>null</value> to be passed when the body content is <code>null</code>.
	 */
	boolean required() default true;

}
