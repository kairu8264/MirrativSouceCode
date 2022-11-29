package com.dena.mirrorman.net.api.response;

import com.dena.mirrorman.net.api.response.CarouselItemType;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class CarouselItemTypeAdapter extends t<CarouselItemType> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public CarouselItemType read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        CarouselItemType.Companion companion = CarouselItemType.Companion;
        String nextString = jsonReader.nextString();
        p.g(nextString, "reader.nextString()");
        return companion.fromTypeName(nextString);
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, CarouselItemType carouselItemType) {
        p.h(jsonWriter, "writer");
        p.h(carouselItemType, "value");
        jsonWriter.value(carouselItemType.getTypeName());
    }
}
