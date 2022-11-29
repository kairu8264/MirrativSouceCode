package androidx.test.core.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

/* loaded from: classes.dex */
public class InstrumentationActivityInvoker$EmptyActivity extends Activity {

    /* renamed from: w  reason: collision with root package name */
    public final BroadcastReceiver f16450w = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker$EmptyActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            InstrumentationActivityInvoker$EmptyActivity.this.finish();
        }
    };

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiver(this.f16450w, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f16450w);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_ACTIVITY_RESUMED"));
    }
}
