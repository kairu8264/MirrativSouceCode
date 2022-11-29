package com.dena.mirrativ.mirrativapi.closet;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class GameEffectTypeAdapter extends t<GameEffectType> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public GameEffectType read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return GameEffectType.Companion.fromInt(jsonReader.nextInt());
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, GameEffectType gameEffectType) {
        p.h(jsonWriter, "writer");
        p.h(gameEffectType, "value");
        jsonWriter.value(Integer.valueOf(gameEffectType.getRawValue()));
    }
}
