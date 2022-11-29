package com.dena.mirrorman.clientlog.logs;

import com.cookpad.puree.Puree;
import ff.b;
import java.util.HashMap;
import java.util.List;
import jo.h;
import jo.p;
import nd.r0;
import wn.k;
import xm.e;
import xn.n0;

/* loaded from: classes2.dex */
public final class MRLogger {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "MRLogger";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public final void sendLog(MRLog mRLog) {
        p.h(mRLog, "log");
        ActionLogBase actionLogBase = new ActionLogBase(mRLog.getActionType(), mRLog.getTargetType(), mRLog.getTargetId(), mRLog.getPageId(), mRLog.getServiceName());
        List<k<String, String>> payload = mRLog.getPayload();
        if (payload != null) {
            actionLogBase.payload = new HashMap<>(n0.l(payload));
        }
        sendLog(actionLogBase);
    }

    public final void sendLog(ActionLogBase actionLogBase) {
        p.h(actionLogBase, "pureeLog");
        Puree.d(actionLogBase);
        b c10 = r0.f42205a.c();
        String action_type = actionLogBase.getAction_type();
        String kVar = new e().z(actionLogBase).toString();
        p.g(kVar, "Gson().toJsonTree(pureeLog).toString()");
        c10.a(action_type, kVar);
    }
}
