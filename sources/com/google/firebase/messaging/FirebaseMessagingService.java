package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.dena.mirrorman.clientlog.logs.MRLog;
import em.l0;
import em.m;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class FirebaseMessagingService extends em.f {
    public static final Queue<String> B = new ArrayDeque(10);

    @Override // em.f
    public Intent c(Intent intent) {
        return l0.b().c();
    }

    @Override // em.f
    public void d(Intent intent) {
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                q(intent.getStringExtra("token"));
                return;
            }
            String valueOf = String.valueOf(intent.getAction());
            Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Unknown intent action: ".concat(valueOf) : new String("Unknown intent action: "));
            return;
        }
        m(intent);
    }

    public final boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = B;
        if (queue.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Received duplicate message: ".concat(valueOf) : new String("Received duplicate message: "));
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    public final void k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (c.t(extras)) {
            c cVar = new c(extras);
            ExecutorService c10 = m.c();
            try {
                if (new em.b(this, cVar, c10).a()) {
                    return;
                }
                c10.shutdown();
                if (b.A(intent)) {
                    b.t(intent);
                }
            } finally {
                c10.shutdown();
            }
        }
        o(new d(extras));
    }

    public final String l(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    public final void m(Intent intent) {
        if (j(intent.getStringExtra("google.message_id"))) {
            return;
        }
        s(intent);
    }

    public void n() {
    }

    public void o(d dVar) {
    }

    public void p(String str) {
    }

    public void q(String str) {
    }

    public void r(String str, Exception exc) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void s(Intent intent) {
        char c10;
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            b.v(intent);
            k(intent);
        } else if (c10 == 1) {
            n();
        } else if (c10 == 2) {
            p(intent.getStringExtra("google.message_id"));
        } else if (c10 != 3) {
            Log.w("FirebaseMessaging", stringExtra.length() != 0 ? "Received message with unknown type: ".concat(stringExtra) : new String("Received message with unknown type: "));
        } else {
            r(l(intent), new SendException(intent.getStringExtra(MRLog.PAYLOAD_KEY_ERROR)));
        }
    }
}
