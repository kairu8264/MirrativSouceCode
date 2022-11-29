package com.dena.mirrativ.mirrativapi.livegame;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class LiveGameMissionProgressStatusTypeAdapter extends t<LiveGameMissionProgressStatusType> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public LiveGameMissionProgressStatusType read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return LiveGameMissionProgressStatusType.Companion.fromInt(jsonReader.nextInt());
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, LiveGameMissionProgressStatusType liveGameMissionProgressStatusType) {
        p.h(jsonWriter, "writer");
        p.h(liveGameMissionProgressStatusType, "value");
        jsonWriter.value(Integer.valueOf(liveGameMissionProgressStatusType.getRawValue()));
    }
}
