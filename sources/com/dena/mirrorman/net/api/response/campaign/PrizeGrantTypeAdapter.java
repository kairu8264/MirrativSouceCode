package com.dena.mirrorman.net.api.response.campaign;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class PrizeGrantTypeAdapter extends t<PrizeGrantType> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public PrizeGrantType read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return PrizeGrantType.Companion.fromInt(jsonReader.nextInt());
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, PrizeGrantType prizeGrantType) {
        p.h(jsonWriter, "writer");
        p.h(prizeGrantType, "value");
        jsonWriter.value(Integer.valueOf(prizeGrantType.getRawValue()));
    }
}
