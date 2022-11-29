package com.dena.mirrativ.mirrativapi.livegame;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class LiveGameMissionStatusTypeAdapter extends t<LiveGameMissionStatusType> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public LiveGameMissionStatusType read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return LiveGameMissionStatusType.Companion.fromInt(jsonReader.nextInt());
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, LiveGameMissionStatusType liveGameMissionStatusType) {
        p.h(jsonWriter, "writer");
        p.h(liveGameMissionStatusType, "value");
        jsonWriter.value(Integer.valueOf(liveGameMissionStatusType.getRawValue()));
    }
}
