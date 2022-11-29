package com.dena.mirrorman.net.api.response.campaign;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class CampaignProgressTypeAdapter extends t<CampaignProgressType> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public CampaignProgressType read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return CampaignProgressType.Companion.fromInt(jsonReader.nextInt());
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, CampaignProgressType campaignProgressType) {
        p.h(jsonWriter, "writer");
        p.h(campaignProgressType, "value");
        jsonWriter.value(Integer.valueOf(campaignProgressType.getRawValue()));
    }
}
