package com.dena.mirrativ.mirrativapi.emomo.event;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class EmomoGameStatusTypeAdapter extends t<EmomoGameStatusType> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public EmomoGameStatusType read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return EmomoGameStatusType.Companion.fromInt(jsonReader.nextInt());
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, EmomoGameStatusType emomoGameStatusType) {
        p.h(jsonWriter, "writer");
        p.h(emomoGameStatusType, "value");
        jsonWriter.value(Integer.valueOf(emomoGameStatusType.getRawValue()));
    }
}
