package com.dena.mirrorman.net.api.response;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public enum ToolTipStartLiveButtonType {
    UNDEFINED_API_PARAM("undefined_api_param"),
    CONTINUOUS_DAY_AND_REQUEST_NUM("continuous_day_and_request_num"),
    REQUEST_NUM("request_num");
    
    public static final Companion Companion = new Companion(null);
    private final String typeName;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ToolTipStartLiveButtonType fromString(String str) {
            ToolTipStartLiveButtonType toolTipStartLiveButtonType;
            p.h(str, "value");
            ToolTipStartLiveButtonType[] values = ToolTipStartLiveButtonType.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    toolTipStartLiveButtonType = null;
                    break;
                }
                toolTipStartLiveButtonType = values[i10];
                if (p.c(toolTipStartLiveButtonType.getTypeName(), str)) {
                    break;
                }
                i10++;
            }
            return toolTipStartLiveButtonType == null ? ToolTipStartLiveButtonType.UNDEFINED_API_PARAM : toolTipStartLiveButtonType;
        }
    }

    ToolTipStartLiveButtonType(String str) {
        this.typeName = str;
    }

    public final String getTypeName() {
        return this.typeName;
    }
}
