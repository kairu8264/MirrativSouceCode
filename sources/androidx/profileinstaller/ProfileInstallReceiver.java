package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.profileinstaller.b;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* loaded from: classes.dex */
    public class a implements b.c {
        public a() {
        }

        @Override // androidx.profileinstaller.b.c
        public void a(int i10, Object obj) {
            b.f15838b.a(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            b.k(context, com.google.android.exoplayer2.offline.a.f26900w, new a(), true);
        } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            String string = intent.getExtras().getString("EXTRA_SKIP_FILE_OPERATION");
            if ("WRITE_SKIP_FILE".equals(string)) {
                b.l(context, com.google.android.exoplayer2.offline.a.f26900w, new a());
            } else if ("DELETE_SKIP_FILE".equals(string)) {
                b.c(context, com.google.android.exoplayer2.offline.a.f26900w, new a());
            }
        }
    }
}
