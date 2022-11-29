package ai;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;

@TargetApi(11)
/* loaded from: classes3.dex */
public final class qp0 extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public final rp0 f9044a;

    public qp0(rp0 rp0Var) {
        this.f9044a = rp0Var;
    }

    public static final Context b(WebView webView) {
        if (!(webView instanceof rp0)) {
            return webView.getContext();
        }
        rp0 rp0Var = (rp0) webView;
        Activity g10 = rp0Var.g();
        return g10 != null ? g10 : rp0Var.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        rp0 rp0Var;
        wg.b b10;
        try {
            rp0Var = this.f9044a;
        } catch (WindowManager.BadTokenException e10) {
            uj0.g("Fail to display Dialog.", e10);
        }
        if (rp0Var != null && rp0Var.i0() != null && this.f9044a.i0().b() != null && (b10 = this.f9044a.i0().b()) != null && !b10.b()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 11 + String.valueOf(str3).length());
            sb2.append("window.");
            sb2.append(str);
            sb2.append("('");
            sb2.append(str3);
            sb2.append("')");
            b10.c(sb2.toString());
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builder.setView(linearLayout).setPositiveButton(17039370, new op0(jsPromptResult, editText)).setNegativeButton(17039360, new np0(jsPromptResult)).setOnCancelListener(new mp0(jsPromptResult)).create().show();
        } else {
            builder.setMessage(str3).setPositiveButton(17039370, new lp0(jsResult)).setNegativeButton(17039360, new kp0(jsResult)).setOnCancelListener(new jp0(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof rp0)) {
            uj0.f("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        xg.n d02 = ((rp0) webView).d0();
        if (d02 == null) {
            uj0.f("Tried to close an AdWebView not associated with an overlay.");
        } else {
            d02.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb2.append("JS: ");
        sb2.append(message);
        sb2.append(" (");
        sb2.append(sourceId);
        sb2.append(":");
        sb2.append(lineNumber);
        sb2.append(")");
        String sb3 = sb2.toString();
        if (sb3.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = pp0.f8491a[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            uj0.c(sb3);
        } else if (i10 == 2) {
            uj0.f(sb3);
        } else if (i10 == 3 || i10 == 4) {
            uj0.e(sb3);
        } else if (i10 != 5) {
            uj0.e(sb3);
        } else {
            uj0.a(sb3);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f9044a.O0() != null) {
            webView2.setWebViewClient(this.f9044a.O0());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = CacheDataSink.DEFAULT_FRAGMENT_SIZE - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 == 0) {
            if (j11 > j13 || j11 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                j11 = 0;
            }
        } else if (j11 == 0) {
            j11 = Math.min(j10 + Math.min((long) PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j13), (long) PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } else {
            if (j11 <= Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        }
        quotaUpdater.updateQuota(j11);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z10;
        if (callback != null) {
            wg.t.d();
            if (!yg.d2.e(this.f9044a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                wg.t.d();
                if (!yg.d2.e(this.f9044a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z10 = false;
                    callback.invoke(str, z10, true);
                }
            }
            z10 = true;
            callback.invoke(str, z10, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        xg.n d02 = this.f9044a.d0();
        if (d02 == null) {
            uj0.f("Could not get ad overlay when hiding custom view.");
        } else {
            d02.b();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReachedMaxAppCacheSize(long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
        long j12 = j10 + PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        if (CacheDataSink.DEFAULT_FRAGMENT_SIZE - j11 < j12) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j12);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        xg.n d02 = this.f9044a.d0();
        if (d02 == null) {
            uj0.f("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        d02.a6(view, customViewCallback);
        d02.Z5(i10);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
