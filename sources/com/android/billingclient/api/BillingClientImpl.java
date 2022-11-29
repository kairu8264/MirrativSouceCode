package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ji.a;
import ji.d;
import ji.p;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class BillingClientImpl extends BillingClient {
    private volatile int zza;
    private final String zzb;
    private final Handler zzc;
    private volatile zzh zzd;
    private Context zze;
    private Context zzf;
    private volatile d zzg;
    private volatile zzaf zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private ExecutorService zzu;

    private BillingClientImpl(Activity activity, boolean z10, String str) {
        this(activity.getApplicationContext(), z10, new zzah(), str, null);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        this.zzf = applicationContext;
        this.zzd = new zzh(applicationContext, purchasesUpdatedListener);
        this.zze = context;
        this.zzt = z10;
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void launchPriceChangeConfirmationFlow(Activity activity, PriceChangeFlowParams priceChangeFlowParams, long j10) {
        launchPriceChangeConfirmationFlow(activity, priceChangeFlowParams, new zzah(j10));
    }

    private void startConnection(long j10) {
        ServiceInfo serviceInfo;
        zzah zzahVar = new zzah(j10);
        if (isReady()) {
            a.j("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzahVar.onBillingSetupFinished(zzak.zzp);
        } else if (this.zza == 1) {
            a.k("BillingClient", "Client is already in the process of connecting to billing service.");
            zzahVar.onBillingSetupFinished(zzak.zzd);
        } else if (this.zza == 3) {
            a.k("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzahVar.onBillingSetupFinished(zzak.zzq);
        } else {
            this.zza = 1;
            this.zzd.zzd();
            a.j("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzaf(this, zzahVar, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zzf.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.zzb);
                    if (this.zzf.bindService(intent2, this.zzh, 1)) {
                        a.j("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    a.k("BillingClient", "Connection to Billing service is blocked.");
                } else {
                    a.k("BillingClient", "The device doesn't have valid Play Store.");
                }
            }
            this.zza = 0;
            a.j("BillingClient", "Billing service unavailable on device.");
            zzahVar.onBillingSetupFinished(zzak.zzc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler zzD() {
        return Looper.myLooper() == null ? this.zzc : new Handler(Looper.myLooper());
    }

    private final BillingResult zzE(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzc.post(new Runnable() { // from class: com.android.billingclient.api.zzq
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzs(billingResult);
            }
        });
        return billingResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult zzF() {
        if (this.zza != 0 && this.zza != 3) {
            return zzak.zzl;
        }
        return zzak.zzq;
    }

    private final BillingResult zzG(final String str) {
        try {
            if (((Integer) zzH(new Callable() { // from class: com.android.billingclient.api.zzn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BillingClientImpl.this.zzn(str);
                }
            }, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, null, zzD()).get(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS)).intValue() == 0) {
                return zzak.zzp;
            }
            return zzak.zzi;
        } catch (Exception unused) {
            a.k("BillingClient", "Exception while checking if billing is supported; try to reconnect");
            return zzak.zzq;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Future<T> zzH(Callable<T> callable, long j10, final Runnable runnable, Handler handler) {
        long j11 = (long) (j10 * 0.95d);
        if (this.zzu == null) {
            this.zzu = Executors.newFixedThreadPool(a.f38055a, new zzac(this));
        }
        try {
            final Future<T> submit = this.zzu.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzw
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    a.k("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j11);
            return submit;
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
            sb2.append("Async task throws exception ");
            sb2.append(valueOf);
            a.k("BillingClient", sb2.toString());
            return null;
        }
    }

    private final void zzI(final BillingResult billingResult, final PriceChangeConfirmationListener priceChangeConfirmationListener) {
        if (Thread.interrupted()) {
            return;
        }
        this.zzc.post(new Runnable() { // from class: com.android.billingclient.api.zzs
            @Override // java.lang.Runnable
            public final void run() {
                PriceChangeConfirmationListener.this.onPriceChangeConfirmationResult(billingResult);
            }
        });
    }

    public static /* synthetic */ zzag zzi(BillingClientImpl billingClientImpl, String str) {
        String valueOf = String.valueOf(str);
        a.j("BillingClient", valueOf.length() != 0 ? "Querying purchase history, item type: ".concat(valueOf) : new String("Querying purchase history, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle f10 = a.f(billingClientImpl.zzn, billingClientImpl.zzt, billingClientImpl.zzb);
        String str2 = null;
        while (billingClientImpl.zzl) {
            try {
                Bundle P3 = billingClientImpl.zzg.P3(6, billingClientImpl.zzf.getPackageName(), str, str2, f10);
                BillingResult zza = zzam.zza(P3, "BillingClient", "getPurchaseHistory()");
                if (zza != zzak.zzp) {
                    return new zzag(zza, null);
                }
                ArrayList<String> stringArrayList = P3.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = P3.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = P3.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                    String str3 = stringArrayList2.get(i10);
                    String str4 = stringArrayList3.get(i10);
                    String valueOf2 = String.valueOf(stringArrayList.get(i10));
                    a.j("BillingClient", valueOf2.length() != 0 ? "Purchase record found for sku : ".concat(valueOf2) : new String("Purchase record found for sku : "));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            a.k("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e10) {
                        String valueOf3 = String.valueOf(e10);
                        StringBuilder sb2 = new StringBuilder(valueOf3.length() + 48);
                        sb2.append("Got an exception trying to decode the purchase: ");
                        sb2.append(valueOf3);
                        a.k("BillingClient", sb2.toString());
                        return new zzag(zzak.zzl, null);
                    }
                }
                str2 = P3.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf4 = String.valueOf(str2);
                a.j("BillingClient", valueOf4.length() != 0 ? "Continuation token: ".concat(valueOf4) : new String("Continuation token: "));
                if (TextUtils.isEmpty(str2)) {
                    return new zzag(zzak.zzp, arrayList);
                }
            } catch (RemoteException e11) {
                String valueOf5 = String.valueOf(e11);
                StringBuilder sb3 = new StringBuilder(valueOf5.length() + 64);
                sb3.append("Got exception trying to get purchase history: ");
                sb3.append(valueOf5);
                sb3.append("; try to reconnect");
                a.k("BillingClient", sb3.toString());
                return new zzag(zzak.zzq, null);
            }
        }
        a.k("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzag(zzak.zzj, null);
    }

    public static /* synthetic */ Purchase.PurchasesResult zzk(BillingClientImpl billingClientImpl, String str) {
        Bundle D1;
        String valueOf = String.valueOf(str);
        a.j("BillingClient", valueOf.length() != 0 ? "Querying owned items, item type: ".concat(valueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle f10 = a.f(billingClientImpl.zzn, billingClientImpl.zzt, billingClientImpl.zzb);
        String str2 = null;
        do {
            try {
                if (billingClientImpl.zzn) {
                    D1 = billingClientImpl.zzg.U2(9, billingClientImpl.zzf.getPackageName(), str, str2, f10);
                } else {
                    D1 = billingClientImpl.zzg.D1(3, billingClientImpl.zzf.getPackageName(), str, str2);
                }
                BillingResult zza = zzam.zza(D1, "BillingClient", "getPurchase()");
                if (zza != zzak.zzp) {
                    return new Purchase.PurchasesResult(zza, null);
                }
                ArrayList<String> stringArrayList = D1.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = D1.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = D1.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                    String str3 = stringArrayList2.get(i10);
                    String str4 = stringArrayList3.get(i10);
                    String valueOf2 = String.valueOf(stringArrayList.get(i10));
                    a.j("BillingClient", valueOf2.length() != 0 ? "Sku is owned: ".concat(valueOf2) : new String("Sku is owned: "));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            a.k("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e10) {
                        String valueOf3 = String.valueOf(e10);
                        StringBuilder sb2 = new StringBuilder(valueOf3.length() + 48);
                        sb2.append("Got an exception trying to decode the purchase: ");
                        sb2.append(valueOf3);
                        a.k("BillingClient", sb2.toString());
                        return new Purchase.PurchasesResult(zzak.zzl, null);
                    }
                }
                str2 = D1.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf4 = String.valueOf(str2);
                a.j("BillingClient", valueOf4.length() != 0 ? "Continuation token: ".concat(valueOf4) : new String("Continuation token: "));
            } catch (Exception e11) {
                String valueOf5 = String.valueOf(e11);
                StringBuilder sb3 = new StringBuilder(valueOf5.length() + 57);
                sb3.append("Got exception trying to get purchases: ");
                sb3.append(valueOf5);
                sb3.append("; try to reconnect");
                a.k("BillingClient", sb3.toString());
                return new Purchase.PurchasesResult(zzak.zzq, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new Purchase.PurchasesResult(zzak.zzp, arrayList);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzak.zzq);
        } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            a.k("BillingClient", "Please provide a valid purchase token.");
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzak.zzk);
        } else if (!this.zzn) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzak.zzb);
        } else if (zzH(new Callable() { // from class: com.android.billingclient.api.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzo(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzj
            @Override // java.lang.Runnable
            public final void run() {
                AcknowledgePurchaseResponseListener.this.onAcknowledgePurchaseResponse(zzak.zzr);
            }
        }, zzD()) == null) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzF());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            consumeResponseListener.onConsumeResponse(zzak.zzq, consumeParams.getPurchaseToken());
        } else if (zzH(new Callable() { // from class: com.android.billingclient.api.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzp(consumeParams, consumeResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzr
            @Override // java.lang.Runnable
            public final void run() {
                ConsumeResponseListener.this.onConsumeResponse(zzak.zzr, consumeParams.getPurchaseToken());
            }
        }, zzD()) == null) {
            consumeResponseListener.onConsumeResponse(zzF(), consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        try {
            this.zze = null;
            this.zzd.zzc();
            if (this.zzh != null) {
                this.zzh.zzc();
            }
            if (this.zzh != null && this.zzg != null) {
                a.j("BillingClient", "Unbinding from service.");
                this.zzf.unbindService(this.zzh);
                this.zzh = null;
            }
            this.zzg = null;
            ExecutorService executorService = this.zzu;
            if (executorService != null) {
                executorService.shutdownNow();
                this.zzu = null;
            }
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 48);
            sb2.append("There was an exception while ending connection: ");
            sb2.append(valueOf);
            a.k("BillingClient", sb2.toString());
        } finally {
            this.zza = 3;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        return this.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        char c10;
        if (!isReady()) {
            return zzak.zzq;
        }
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 97314:
                if (str.equals("bbb")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 207616302:
                if (str.equals(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 292218239:
                if (str.equals(BillingClient.FeatureType.IN_APP_ITEMS_ON_VR)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1219490065:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_ON_VR)) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1987365622:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return this.zzi ? zzak.zzp : zzak.zzi;
            case 1:
                if (this.zzj) {
                    return zzak.zzp;
                }
                return zzak.zzi;
            case 2:
                return zzG(BillingClient.SkuType.INAPP);
            case 3:
                return zzG(BillingClient.SkuType.SUBS);
            case 4:
                return this.zzm ? zzak.zzp : zzak.zzi;
            case 5:
                return this.zzp ? zzak.zzp : zzak.zzi;
            case 6:
                return this.zzr ? zzak.zzp : zzak.zzi;
            case 7:
                return this.zzq ? zzak.zzp : zzak.zzi;
            case '\b':
            case '\t':
                return this.zzs ? zzak.zzp : zzak.zzi;
            default:
                a.k("BillingClient", str.length() != 0 ? "Unsupported feature: ".concat(str) : new String("Unsupported feature: "));
                return zzak.zzv;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.zza != 2 || this.zzg == null || this.zzh == null) ? false : true;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult launchBillingFlow(Activity activity, final BillingFlowParams billingFlowParams) {
        String str;
        String str2;
        String str3;
        Future zzH;
        boolean z10;
        int i10;
        int i11;
        String str4;
        String str5 = "BUY_INTENT";
        if (!isReady()) {
            BillingResult billingResult = zzak.zzq;
            zzE(billingResult);
            return billingResult;
        }
        ArrayList<SkuDetails> zzj = billingFlowParams.zzj();
        final SkuDetails skuDetails = zzj.get(0);
        final String type = skuDetails.getType();
        if (type.equals(BillingClient.SkuType.SUBS) && !this.zzi) {
            a.k("BillingClient", "Current client doesn't support subscriptions.");
            BillingResult billingResult2 = zzak.zzs;
            zzE(billingResult2);
            return billingResult2;
        } else if (billingFlowParams.zzm() && !this.zzl) {
            a.k("BillingClient", "Current client doesn't support extra params for buy intent.");
            BillingResult billingResult3 = zzak.zzh;
            zzE(billingResult3);
            return billingResult3;
        } else if (zzj.size() > 1 && !this.zzs) {
            a.k("BillingClient", "Current client doesn't support multi-item purchases.");
            BillingResult billingResult4 = zzak.zzu;
            zzE(billingResult4);
            return billingResult4;
        } else {
            String str6 = "";
            for (int i12 = 0; i12 < zzj.size(); i12++) {
                String valueOf = String.valueOf(str6);
                String valueOf2 = String.valueOf(zzj.get(i12));
                StringBuilder sb2 = new StringBuilder(valueOf.length() + valueOf2.length());
                sb2.append(valueOf);
                sb2.append(valueOf2);
                String sb3 = sb2.toString();
                if (i12 < zzj.size() - 1) {
                    sb3 = String.valueOf(sb3).concat(", ");
                }
                str6 = sb3;
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(str6).length() + 41 + type.length());
            sb4.append("Constructing buy intent for ");
            sb4.append(str6);
            sb4.append(", item type: ");
            sb4.append(type);
            a.j("BillingClient", sb4.toString());
            if (this.zzl) {
                final Bundle e10 = a.e(billingFlowParams, this.zzn, this.zzt, this.zzb);
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<String> arrayList2 = new ArrayList<>();
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<Integer> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                str2 = "; try to reconnect";
                int size = zzj.size();
                str3 = str6;
                int i13 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                while (i13 < size) {
                    SkuDetails skuDetails2 = zzj.get(i13);
                    if (skuDetails2.zze().isEmpty()) {
                        i11 = size;
                    } else {
                        i11 = size;
                        arrayList.add(skuDetails2.zze());
                    }
                    String str7 = str5;
                    try {
                        str4 = new JSONObject(skuDetails2.getOriginalJson()).optString("offer_id_token");
                    } catch (JSONException unused) {
                        str4 = "";
                    }
                    String zzb = skuDetails2.zzb();
                    int zza = skuDetails2.zza();
                    String zzd = skuDetails2.zzd();
                    arrayList2.add(str4);
                    z11 |= !TextUtils.isEmpty(str4);
                    arrayList3.add(zzb);
                    z12 |= !TextUtils.isEmpty(zzb);
                    arrayList4.add(Integer.valueOf(zza));
                    z13 |= zza != 0;
                    z14 |= !TextUtils.isEmpty(zzd);
                    arrayList5.add(zzd);
                    i13++;
                    size = i11;
                    str5 = str7;
                }
                str = str5;
                if (!arrayList.isEmpty()) {
                    e10.putStringArrayList("skuDetailsTokens", arrayList);
                }
                if (z11) {
                    if (!this.zzq) {
                        BillingResult billingResult5 = zzak.zzi;
                        zzE(billingResult5);
                        return billingResult5;
                    }
                    e10.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
                }
                if (z12) {
                    e10.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
                }
                if (z13) {
                    e10.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList4);
                }
                if (z14) {
                    e10.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (TextUtils.isEmpty(skuDetails.zzc())) {
                    z10 = false;
                } else {
                    e10.putString("skuPackageName", skuDetails.zzc());
                    z10 = true;
                }
                if (!TextUtils.isEmpty(null)) {
                    e10.putString("accountName", null);
                }
                if (zzj.size() > 1) {
                    ArrayList<String> arrayList6 = new ArrayList<>(zzj.size() - 1);
                    ArrayList<String> arrayList7 = new ArrayList<>(zzj.size() - 1);
                    for (int i14 = 1; i14 < zzj.size(); i14++) {
                        arrayList6.add(zzj.get(i14).getSku());
                        arrayList7.add(zzj.get(i14).getType());
                    }
                    e10.putStringArrayList("additionalSkus", arrayList6);
                    e10.putStringArrayList("additionalSkuTypes", arrayList7);
                }
                if (!TextUtils.isEmpty(activity.getIntent().getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = activity.getIntent().getStringExtra("PROXY_PACKAGE");
                    e10.putString("proxyPackage", stringExtra);
                    try {
                        e10.putString("proxyPackageVersion", this.zzf.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        e10.putString("proxyPackageVersion", "package not found");
                    }
                }
                if (this.zzr && z10) {
                    i10 = 15;
                } else if (this.zzn) {
                    i10 = 9;
                } else {
                    i10 = billingFlowParams.getVrPurchaseFlow() ? 7 : 6;
                }
                final int i15 = i10;
                zzH = zzH(new Callable() { // from class: com.android.billingclient.api.zzx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return BillingClientImpl.this.zze(i15, skuDetails, type, billingFlowParams, e10);
                    }
                }, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, null, this.zzc);
            } else {
                str = "BUY_INTENT";
                str2 = "; try to reconnect";
                str3 = str6;
                zzH = zzH(new Callable() { // from class: com.android.billingclient.api.zzm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return BillingClientImpl.this.zzf(skuDetails, type);
                    }
                }, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, null, this.zzc);
            }
            try {
                Bundle bundle = (Bundle) zzH.get(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS);
                int a10 = a.a(bundle, "BillingClient");
                String h10 = a.h(bundle, "BillingClient");
                if (a10 != 0) {
                    StringBuilder sb5 = new StringBuilder(52);
                    sb5.append("Unable to buy item, Error response code: ");
                    sb5.append(a10);
                    a.k("BillingClient", sb5.toString());
                    BillingResult.Builder newBuilder = BillingResult.newBuilder();
                    newBuilder.setResponseCode(a10);
                    newBuilder.setDebugMessage(h10);
                    BillingResult build = newBuilder.build();
                    zzE(build);
                    return build;
                }
                Intent intent = new Intent(activity, ProxyBillingActivity.class);
                String str8 = str;
                intent.putExtra(str8, (PendingIntent) bundle.getParcelable(str8));
                activity.startActivity(intent);
                return zzak.zzp;
            } catch (CancellationException | TimeoutException unused3) {
                String str9 = str3;
                StringBuilder sb6 = new StringBuilder(String.valueOf(str9).length() + 68);
                sb6.append("Time out while launching billing flow: ; for sku: ");
                sb6.append(str9);
                sb6.append(str2);
                a.k("BillingClient", sb6.toString());
                BillingResult billingResult6 = zzak.zzr;
                zzE(billingResult6);
                return billingResult6;
            } catch (Exception unused4) {
                StringBuilder sb7 = new StringBuilder(String.valueOf(str3).length() + 69);
                sb7.append("Exception while launching billing flow: ; for sku: ");
                sb7.append(str3);
                sb7.append(str2);
                a.k("BillingClient", sb7.toString());
                BillingResult billingResult7 = zzak.zzq;
                zzE(billingResult7);
                return billingResult7;
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzak.zzq, null);
        } else if (zzH(new zzab(this, str, purchaseHistoryResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzt
            @Override // java.lang.Runnable
            public final void run() {
                PurchaseHistoryResponseListener.this.onPurchaseHistoryResponse(zzak.zzr, null);
            }
        }, zzD()) == null) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzF(), null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final Purchase.PurchasesResult queryPurchases(String str) {
        if (!isReady()) {
            return new Purchase.PurchasesResult(zzak.zzq, null);
        }
        if (TextUtils.isEmpty(str)) {
            a.k("BillingClient", "Please provide a valid SKU type.");
            return new Purchase.PurchasesResult(zzak.zzg, null);
        }
        try {
            return (Purchase.PurchasesResult) zzH(new zzz(this, str), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, null, this.zzc).get(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new Purchase.PurchasesResult(zzak.zzr, null);
        } catch (Exception unused2) {
            return new Purchase.PurchasesResult(zzak.zzl, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zze
    public void queryPurchasesAsync(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            purchasesResponseListener.onQueryPurchasesResponse(zzak.zzq, p.l());
        } else if (TextUtils.isEmpty(str)) {
            a.k("BillingClient", "Please provide a valid SKU type.");
            purchasesResponseListener.onQueryPurchasesResponse(zzak.zzg, p.l());
        } else if (zzH(new zzaa(this, str, purchasesResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzu
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesResponseListener.this.onQueryPurchasesResponse(zzak.zzr, p.l());
            }
        }, zzD()) == null) {
            purchasesResponseListener.onQueryPurchasesResponse(zzF(), p.l());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            skuDetailsResponseListener.onSkuDetailsResponse(zzak.zzq, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            a.k("BillingClient", "Please fix the input params. SKU type can't be empty.");
            skuDetailsResponseListener.onSkuDetailsResponse(zzak.zzg, null);
        } else if (skusList != null) {
            final ArrayList arrayList = new ArrayList();
            for (String str : skusList) {
                zzap zzapVar = new zzap(null);
                zzapVar.zza(str);
                arrayList.add(zzapVar.zzb());
            }
            if (zzH(new Callable(skuType, arrayList, null, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzp
                public final /* synthetic */ String zzb;
                public final /* synthetic */ List zzc;
                public final /* synthetic */ SkuDetailsResponseListener zzd;

                {
                    this.zzd = skuDetailsResponseListener;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BillingClientImpl.this.zzq(this.zzb, this.zzc, null, this.zzd);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzv
                @Override // java.lang.Runnable
                public final void run() {
                    SkuDetailsResponseListener.this.onSkuDetailsResponse(zzak.zzr, null);
                }
            }, zzD()) == null) {
                skuDetailsResponseListener.onSkuDetailsResponse(zzF(), null);
            }
        } else {
            a.k("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            skuDetailsResponseListener.onSkuDetailsResponse(zzak.zzf, null);
        }
    }

    public final /* synthetic */ Bundle zze(int i10, SkuDetails skuDetails, String str, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        return this.zzg.l2(i10, this.zzf.getPackageName(), skuDetails.getSku(), str, null, bundle);
    }

    public final /* synthetic */ Bundle zzf(SkuDetails skuDetails, String str) throws Exception {
        return this.zzg.u4(3, this.zzf.getPackageName(), skuDetails.getSku(), str, null);
    }

    public final /* synthetic */ Bundle zzg(String str, Bundle bundle) throws Exception {
        return this.zzg.w1(8, this.zzf.getPackageName(), str, BillingClient.SkuType.SUBS, bundle);
    }

    public final /* synthetic */ Integer zzn(String str) throws Exception {
        d dVar = this.zzg;
        String packageName = this.zzf.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putBoolean(BillingFlowParams.EXTRA_PARAM_KEY_VR, true);
        return Integer.valueOf(dVar.u5(7, packageName, str, bundle));
    }

    public final /* synthetic */ Object zzo(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            Bundle I5 = this.zzg.I5(9, this.zzf.getPackageName(), acknowledgePurchaseParams.getPurchaseToken(), a.b(acknowledgePurchaseParams, this.zzb));
            int a10 = a.a(I5, "BillingClient");
            String h10 = a.h(I5, "BillingClient");
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(a10);
            newBuilder.setDebugMessage(h10);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(newBuilder.build());
            return null;
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
            sb2.append("Error acknowledge purchase; ex: ");
            sb2.append(valueOf);
            a.k("BillingClient", sb2.toString());
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzak.zzq);
            return null;
        }
    }

    public final /* synthetic */ Object zzp(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        int Q0;
        String str;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            String valueOf = String.valueOf(purchaseToken);
            a.j("BillingClient", valueOf.length() != 0 ? "Consuming purchase with token: ".concat(valueOf) : new String("Consuming purchase with token: "));
            if (this.zzn) {
                Bundle K3 = this.zzg.K3(9, this.zzf.getPackageName(), purchaseToken, a.c(consumeParams, this.zzn, this.zzb));
                Q0 = K3.getInt("RESPONSE_CODE");
                str = a.h(K3, "BillingClient");
            } else {
                Q0 = this.zzg.Q0(3, this.zzf.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(Q0);
            newBuilder.setDebugMessage(str);
            BillingResult build = newBuilder.build();
            if (Q0 == 0) {
                a.j("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(build, purchaseToken);
                return null;
            }
            StringBuilder sb2 = new StringBuilder(63);
            sb2.append("Error consuming purchase with token. Response code: ");
            sb2.append(Q0);
            a.k("BillingClient", sb2.toString());
            consumeResponseListener.onConsumeResponse(build, purchaseToken);
            return null;
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 30);
            sb3.append("Error consuming purchase; ex: ");
            sb3.append(valueOf2);
            a.k("BillingClient", sb3.toString());
            consumeResponseListener.onConsumeResponse(zzak.zzq, purchaseToken);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
        r4 = 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object zzq(java.lang.String r22, java.util.List r23, java.lang.String r24, com.android.billingclient.api.SkuDetailsResponseListener r25) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.zzq(java.lang.String, java.util.List, java.lang.String, com.android.billingclient.api.SkuDetailsResponseListener):java.lang.Object");
    }

    public final /* synthetic */ void zzs(BillingResult billingResult) {
        this.zzd.zzb().onPurchasesUpdated(billingResult, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void launchPriceChangeConfirmationFlow(Activity activity, PriceChangeFlowParams priceChangeFlowParams, PriceChangeConfirmationListener priceChangeConfirmationListener) {
        if (!isReady()) {
            zzI(zzak.zzq, priceChangeConfirmationListener);
        } else if (priceChangeFlowParams != null && priceChangeFlowParams.getSkuDetails() != null) {
            final String sku = priceChangeFlowParams.getSkuDetails().getSku();
            if (sku == null) {
                a.k("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
                zzI(zzak.zzn, priceChangeConfirmationListener);
            } else if (!this.zzm) {
                a.k("BillingClient", "Current client doesn't support price change confirmation flow.");
                zzI(zzak.zzi, priceChangeConfirmationListener);
            } else {
                final Bundle bundle = new Bundle();
                bundle.putString("playBillingLibraryVersion", this.zzb);
                bundle.putBoolean("subs_price_change", true);
                try {
                    Bundle bundle2 = (Bundle) zzH(new Callable() { // from class: com.android.billingclient.api.zzo
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return BillingClientImpl.this.zzg(sku, bundle);
                        }
                    }, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, null, this.zzc).get(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS);
                    int a10 = a.a(bundle2, "BillingClient");
                    String h10 = a.h(bundle2, "BillingClient");
                    BillingResult.Builder newBuilder = BillingResult.newBuilder();
                    newBuilder.setResponseCode(a10);
                    newBuilder.setDebugMessage(h10);
                    BillingResult build = newBuilder.build();
                    if (a10 != 0) {
                        StringBuilder sb2 = new StringBuilder(68);
                        sb2.append("Unable to launch price change flow, error response code: ");
                        sb2.append(a10);
                        a.k("BillingClient", sb2.toString());
                        zzI(build, priceChangeConfirmationListener);
                        return;
                    }
                    zzy zzyVar = new zzy(this, this.zzc, priceChangeConfirmationListener);
                    Intent intent = new Intent(activity, ProxyBillingActivity.class);
                    intent.putExtra("SUBS_MANAGEMENT_INTENT", (PendingIntent) bundle2.getParcelable("SUBS_MANAGEMENT_INTENT"));
                    intent.putExtra("result_receiver", zzyVar);
                    activity.startActivity(intent);
                } catch (CancellationException | TimeoutException unused) {
                    StringBuilder sb3 = new StringBuilder(sku.length() + 70);
                    sb3.append("Time out while launching Price Change Flow for sku: ");
                    sb3.append(sku);
                    sb3.append("; try to reconnect");
                    a.k("BillingClient", sb3.toString());
                    zzI(zzak.zzr, priceChangeConfirmationListener);
                } catch (Exception unused2) {
                    StringBuilder sb4 = new StringBuilder(sku.length() + 78);
                    sb4.append("Exception caught while launching Price Change Flow for sku: ");
                    sb4.append(sku);
                    sb4.append("; try to reconnect");
                    a.k("BillingClient", sb4.toString());
                    zzI(zzak.zzq, priceChangeConfirmationListener);
                }
            }
        } else {
            a.k("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
            zzI(zzak.zzn, priceChangeConfirmationListener);
        }
    }

    private BillingClientImpl(Context context, boolean z10, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, z10);
    }

    private BillingClientImpl(String str) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BillingClientImpl(java.lang.String r7, boolean r8, android.content.Context r9, com.android.billingclient.api.PurchasesUpdatedListener r10) {
        /*
            r6 = this;
            java.lang.Class<com.android.billingclient.ktx.BuildConfig> r7 = com.android.billingclient.ktx.BuildConfig.class
            java.lang.String r0 = "VERSION_NAME"
            java.lang.reflect.Field r7 = r7.getField(r0)     // Catch: java.lang.Exception -> L10
            r0 = 0
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Exception -> L10
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L10
            goto L12
        L10:
            java.lang.String r7 = "4.0.0"
        L12:
            r4 = r7
            r5 = 0
            r0 = r6
            r1 = r9
            r2 = r8
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.<init>(java.lang.String, boolean, android.content.Context, com.android.billingclient.api.PurchasesUpdatedListener):void");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            a.j("BillingClient", "Service connection is valid. No need to re-initialize.");
            billingClientStateListener.onBillingSetupFinished(zzak.zzp);
        } else if (this.zza == 1) {
            a.k("BillingClient", "Client is already in the process of connecting to billing service.");
            billingClientStateListener.onBillingSetupFinished(zzak.zzd);
        } else if (this.zza == 3) {
            a.k("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            billingClientStateListener.onBillingSetupFinished(zzak.zzq);
        } else {
            this.zza = 1;
            this.zzd.zzd();
            a.j("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzaf(this, billingClientStateListener, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zzf.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.zzb);
                    if (this.zzf.bindService(intent2, this.zzh, 1)) {
                        a.j("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    a.k("BillingClient", "Connection to Billing service is blocked.");
                } else {
                    a.k("BillingClient", "The device doesn't have valid Play Store.");
                }
            }
            this.zza = 0;
            a.j("BillingClient", "Billing service unavailable on device.");
            billingClientStateListener.onBillingSetupFinished(zzak.zzc);
        }
    }
}
