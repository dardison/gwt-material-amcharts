package gwt.material.design.amcharts.client.ui.chart.datafields;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class IPieSeriesDataFields extends ISeriesDataFields {

    @JsProperty
    public String category;

    @JsProperty
    public Object hiddenInLegend;

    @JsProperty
    public String radiusValue;

    @JsProperty
    public Object visible;
}