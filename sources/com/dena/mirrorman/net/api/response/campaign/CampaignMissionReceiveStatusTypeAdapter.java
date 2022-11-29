package com.dena.mirrorman.net.api.response.campaign;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jo.p;
import xm.t;

/* loaded from: classes2.dex */
public final class CampaignMissionReceiveStatusTypeAdapter extends t<CampaignMissionReceiveStatus> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xm.t
    public CampaignMissionReceiveStatus read(JsonReader jsonReader) {
        p.h(jsonReader, "reader");
        jsonReader.peek();
        return CampaignMissionReceiveStatus.Companion.fromInt(jsonReader.nextInt());
    }

    @Override // xm.t
    public void write(JsonWriter jsonWriter, CampaignMissionReceiveStatus campaignMissionReceiveStatus) {
        p.h(jsonWriter, "writer");
        p.h(campaignMissionReceiveStatus, "value");
        jsonWriter.value(Integer.valueOf(campaignMissionReceiveStatus.getRawValue()));
    }
}
