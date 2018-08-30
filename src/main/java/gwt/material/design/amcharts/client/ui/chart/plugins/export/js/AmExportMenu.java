/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
 * %%
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
 * #L%
 */
package gwt.material.design.amcharts.client.ui.chart.plugins.export.js;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Used to create / manage AmChart Export Menu
 * <h3>Usage:</h3>
 * <pre>
 *     AmExportMenu[] exportMenus = config.menu[0].menu[2].menu;
 *     chart.getExport().createMenu(exportMenus);
 * </pre>
 *
 * @author kevzlou7979@gmail.com
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AmExportMenu {

    @JsProperty
    public AmExportMenu[] menu;
}