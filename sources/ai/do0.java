package ai;

import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class do0 implements Runnable {
    public final /* synthetic */ fo0 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f3357w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f3358x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f3359y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f3360z;

    public do0(fo0 fo0Var, String str, String str2, String str3, String str4) {
        this.A = fo0Var;
        this.f3357w = str;
        this.f3358x = str2;
        this.f3359y = str3;
        this.f3360z = str4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f3357w);
        if (!TextUtils.isEmpty(this.f3358x)) {
            hashMap.put("cachedSrc", this.f3358x);
        }
        String str = this.f3359y;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 96784904:
                if (str.equals(MRLog.PAYLOAD_KEY_ERROR)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        String str2 = "internal";
        switch (c10) {
            case 6:
            case 7:
                str2 = "io";
                break;
            case '\b':
            case '\t':
                str2 = "network";
                break;
            case '\n':
            case 11:
                str2 = "policy";
                break;
        }
        hashMap.put("type", str2);
        hashMap.put("reason", this.f3359y);
        if (!TextUtils.isEmpty(this.f3360z)) {
            hashMap.put("message", this.f3360z);
        }
        fo0.t(this.A, "onPrecacheEvent", hashMap);
    }
}
