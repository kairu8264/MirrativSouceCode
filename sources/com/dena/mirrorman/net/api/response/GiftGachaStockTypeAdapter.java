package com.dena.mirrorman.net.api.response;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class GiftGachaStockTypeAdapter extends t<GiftGachaStockType> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public GiftGachaStockType read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return GiftGachaStockType.Companion.fromInt(jsonReader.nextInt());
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, GiftGachaStockType giftGachaStockType) {
        p.h(jsonWriter, "writer");
        p.h(giftGachaStockType, "value");
        jsonWriter.value(Integer.valueOf(giftGachaStockType.getRawValue()));
    }
}
