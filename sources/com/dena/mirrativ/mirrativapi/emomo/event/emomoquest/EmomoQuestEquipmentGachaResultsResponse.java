package com.dena.mirrativ.mirrativapi.emomo.event.emomoquest;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoQuestEquipmentGachaResultsResponse implements Serializable {
    private final String elementImageUrl;
    private final List<GiftGachaItem> results;
    private final String specialEffectSpan;
    private final Status status;

    public EmomoQuestEquipmentGachaResultsResponse(String str, String str2, List<GiftGachaItem> list, Status status) {
        p.h(str2, "elementImageUrl");
        p.h(list, "results");
        p.h(status, "status");
        this.specialEffectSpan = str;
        this.elementImageUrl = str2;
        this.results = list;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmomoQuestEquipmentGachaResultsResponse copy$default(EmomoQuestEquipmentGachaResultsResponse emomoQuestEquipmentGachaResultsResponse, String str, String str2, List list, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emomoQuestEquipmentGachaResultsResponse.specialEffectSpan;
        }
        if ((i10 & 2) != 0) {
            str2 = emomoQuestEquipmentGachaResultsResponse.elementImageUrl;
        }
        if ((i10 & 4) != 0) {
            list = emomoQuestEquipmentGachaResultsResponse.results;
        }
        if ((i10 & 8) != 0) {
            status = emomoQuestEquipmentGachaResultsResponse.status;
        }
        return emomoQuestEquipmentGachaResultsResponse.copy(str, str2, list, status);
    }

    public final String component1() {
        return this.specialEffectSpan;
    }

    public final String component2() {
        return this.elementImageUrl;
    }

    public final List<GiftGachaItem> component3() {
        return this.results;
    }

    public final Status component4() {
        return this.status;
    }

    public final EmomoQuestEquipmentGachaResultsResponse copy(String str, String str2, List<GiftGachaItem> list, Status status) {
        p.h(str2, "elementImageUrl");
        p.h(list, "results");
        p.h(status, "status");
        return new EmomoQuestEquipmentGachaResultsResponse(str, str2, list, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestEquipmentGachaResultsResponse) {
            EmomoQuestEquipmentGachaResultsResponse emomoQuestEquipmentGachaResultsResponse = (EmomoQuestEquipmentGachaResultsResponse) obj;
            return p.c(this.specialEffectSpan, emomoQuestEquipmentGachaResultsResponse.specialEffectSpan) && p.c(this.elementImageUrl, emomoQuestEquipmentGachaResultsResponse.elementImageUrl) && p.c(this.results, emomoQuestEquipmentGachaResultsResponse.results) && p.c(this.status, emomoQuestEquipmentGachaResultsResponse.status);
        }
        return false;
    }

    public final String getElementImageUrl() {
        return this.elementImageUrl;
    }

    public final List<GiftGachaItem> getResults() {
        return this.results;
    }

    public final String getSpecialEffectSpan() {
        return this.specialEffectSpan;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.specialEffectSpan;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.elementImageUrl.hashCode()) * 31) + this.results.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "EmomoQuestEquipmentGachaResultsResponse(specialEffectSpan=" + this.specialEffectSpan + ", elementImageUrl=" + this.elementImageUrl + ", results=" + this.results + ", status=" + this.status + ')';
    }
}
