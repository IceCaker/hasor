/*
 * Copyright 2008-2009 the original author or authors.
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
/**
 * 提供一个工具，可以连接远端 tConsole 并执行指令。
 */
package net.hasor.tconsole.spi;
import net.hasor.tconsole.TelContext;

/**
 * 当 tConsole 环境启动时触发。
 * @version : 2019年10月30日
 * @author 赵永春 (zyc@hasor.net)
 */
@FunctionalInterface
public interface TelStartContextListener extends java.util.EventListener {
    /** Receives notification that a context is start. */
    public void onStart(TelContext telContext);
}