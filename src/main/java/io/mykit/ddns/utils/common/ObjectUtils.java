/**
 * Copyright 2020-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.ddns.utils.common;

import java.util.Collection;

/**
 * @author binghe
 * @version 1.0.0
 * @description 工具类
 */
public class ObjectUtils {

    public static <T> boolean isEmpty(Collection<T> collection){
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(String ... str){
        return str == null || str.length <= 0;
    }

    public static boolean isEmpty(String str){
        return str == null || str.trim().isEmpty();
    }

    public static String[] splitString(String str, String split){
        if (isEmpty(str)) return new String[0];
        if (!str.contains(split)) return new String[]{str};
        return str.split(split);
    }
}
