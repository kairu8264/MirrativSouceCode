package androidx.test.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.test.internal.util.Checks;

/* loaded from: classes.dex */
public class InstrumentationActivityInvoker$BootstrapActivity extends Activity {

    /* renamed from: y  reason: collision with root package name */
    public static final String f16446y = "androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity";

    /* renamed from: w  reason: collision with root package name */
    public final BroadcastReceiver f16447w = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            InstrumentationActivityInvoker$BootstrapActivity.this.finishActivity(0);
            InstrumentationActivityInvoker$BootstrapActivity.this.finish();
        }
    };

    /* renamed from: x  reason: collision with root package name */
    public boolean f16448x;

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 0) {
            Intent intent2 = new Intent("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
            intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i11);
            if (intent != null) {
                intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
            }
            sendBroadcast(intent2);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiver(this.f16447w, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY"));
        this.f16448x = bundle != null && bundle.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false);
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f16447w);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f16448x) {
            return;
        }
        this.f16448x = true;
        PendingIntent pendingIntent = (PendingIntent) Checks.a((PendingIntent) getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY"));
        Bundle bundleExtra = getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY");
        if (bundleExtra != null) {
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0, bundleExtra);
                }
            } catch (IntentSender.SendIntentException e10) {
                Log.e(f16446y, "Failed to start target activity.", e10);
                throw new RuntimeException(e10);
            }
        }
        startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.f16448x);
    }
}
