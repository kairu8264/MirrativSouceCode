package ab;

import ab.b;
import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientKotlinKt;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResult;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResult;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.otherfeatures.OtherFeaturesApi;
import com.dena.mirrativ.mirrativapi.otherfeatures.coin.CoinProduct;
import com.dena.mirrativ.mirrativapi.otherfeatures.coin.GetCoinProductsResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import uo.q0;

/* loaded from: classes2.dex */
public final class a implements q0 {
    public final q8.a A;
    public final MRLogger B;
    public final OtherFeaturesApi C;
    public final /* synthetic */ da.b D;

    /* renamed from: w  reason: collision with root package name */
    public final String f700w;

    /* renamed from: x  reason: collision with root package name */
    public final String f701x;

    /* renamed from: y  reason: collision with root package name */
    public final BillingClient f702y;

    /* renamed from: z  reason: collision with root package name */
    public final Context f703z;

    /* renamed from: ab.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0013a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f704a;

        static {
            int[] iArr = new int[r.values().length];
            iArr[r.USED.ordinal()] = 1;
            iArr[r.SUCCESS.ordinal()] = 2;
            iArr[r.RECEIPT_ERROR.ordinal()] = 3;
            iArr[r.ERROR.ordinal()] = 4;
            iArr[r.PENDING.ordinal()] = 5;
            f704a = iArr;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseActionCreator", f = "CoinPurchaseActionCreator.kt", l = {178, 181}, m = "checkReceipt")
    /* loaded from: classes2.dex */
    public static final class b extends co.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f705w;

        /* renamed from: x  reason: collision with root package name */
        public Object f706x;

        /* renamed from: y  reason: collision with root package name */
        public Object f707y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f708z;

        public b(ao.d<? super b> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return a.this.f(null, null, false, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseActionCreator$fetchCoinPurchase$1", f = "CoinPurchaseActionCreator.kt", l = {43, 52}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f709w;

        /* renamed from: x  reason: collision with root package name */
        public int f710x;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            GetCoinProductsResponse getCoinProductsResponse;
            SkuDetailsResult skuDetailsResult;
            Object obj2;
            Object c10 = bo.c.c();
            int i10 = this.f710x;
            try {
            } catch (Throwable th2) {
                a.this.A.a(new b.d(MRErrorKt.convertMRException(th2).getError()));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                a.this.A.a(b.e.f724a);
                OtherFeaturesApi otherFeaturesApi = a.this.C;
                String str = a.this.f701x;
                this.f710x = 1;
                obj = otherFeaturesApi.getCoinProducts(str, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                wn.m.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getCoinProductsResponse = (GetCoinProductsResponse) this.f709w;
                wn.m.b(obj);
                skuDetailsResult = (SkuDetailsResult) obj;
                List<SkuDetails> skuDetailsList = skuDetailsResult.getSkuDetailsList();
                if (skuDetailsResult.getBillingResult().getResponseCode() == 0 || skuDetailsList == null || !(!skuDetailsList.isEmpty())) {
                    a.this.A.a(new b.d(getCoinProductsResponse.getStatus().getMirrativError()));
                } else {
                    q8.a aVar = a.this.A;
                    jf.f fVar = new jf.f(getCoinProductsResponse.getFreeCoin(), getCoinProductsResponse.getPaidCoin());
                    ArrayList arrayList = new ArrayList();
                    for (SkuDetails skuDetails : skuDetailsList) {
                        Iterator<T> it = getCoinProductsResponse.getProducts().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (jo.p.c(((CoinProduct) obj2).getAndroidProductIdentifier(), skuDetails.getSku())) {
                                break;
                            }
                        }
                        CoinProduct coinProduct = (CoinProduct) obj2;
                        w wVar = coinProduct != null ? new w(skuDetails, coinProduct) : null;
                        if (wVar != null) {
                            arrayList.add(wVar);
                        }
                    }
                    aVar.a(new b.f(fVar, arrayList));
                }
                return wn.v.f59242a;
            }
            GetCoinProductsResponse getCoinProductsResponse2 = (GetCoinProductsResponse) obj;
            List<CoinProduct> products = getCoinProductsResponse2.getProducts();
            ArrayList arrayList2 = new ArrayList(xn.t.u(products, 10));
            for (CoinProduct coinProduct2 : products) {
                arrayList2.add(coinProduct2.getAndroidProductIdentifier());
            }
            BillingClient billingClient = a.this.f702y;
            SkuDetailsParams build = SkuDetailsParams.newBuilder().setSkusList(arrayList2).setType(BillingClient.SkuType.INAPP).build();
            jo.p.g(build, "newBuilder()\n           …                 .build()");
            this.f709w = getCoinProductsResponse2;
            this.f710x = 2;
            Object querySkuDetails = BillingClientKotlinKt.querySkuDetails(billingClient, build, this);
            if (querySkuDetails == c10) {
                return c10;
            }
            getCoinProductsResponse = getCoinProductsResponse2;
            obj = querySkuDetails;
            skuDetailsResult = (SkuDetailsResult) obj;
            List<SkuDetails> skuDetailsList2 = skuDetailsResult.getSkuDetailsList();
            if (skuDetailsResult.getBillingResult().getResponseCode() == 0) {
            }
            a.this.A.a(new b.d(getCoinProductsResponse.getStatus().getMirrativError()));
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseActionCreator$onPurchasesUpdated$1", f = "CoinPurchaseActionCreator.kt", l = {132}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f712w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<Purchase> f714y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ List<w> f715z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends Purchase> list, List<w> list2, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f714y = list;
            this.f715z = list2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f714y, this.f715z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f712w;
            if (i10 == 0) {
                wn.m.b(obj);
                a aVar = a.this;
                List<Purchase> list = this.f714y;
                if (list == null) {
                    list = xn.s.k();
                }
                List<w> list2 = this.f715z;
                this.f712w = 1;
                if (aVar.f(list, list2, false, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseActionCreator$restore$2", f = "CoinPurchaseActionCreator.kt", l = {111, 115}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f716w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f718y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ List<w> f719z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, List<w> list, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f718y = z10;
            this.f719z = list;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f718y, this.f719z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f716w;
            if (i10 == 0) {
                wn.m.b(obj);
                BillingClient billingClient = a.this.f702y;
                this.f716w = 1;
                obj = BillingClientKotlinKt.queryPurchasesAsync(billingClient, BillingClient.SkuType.INAPP, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            PurchasesResult purchasesResult = (PurchasesResult) obj;
            List<Purchase> purchasesList = purchasesResult.getPurchasesList();
            if ((purchasesList == null || purchasesList.isEmpty()) && !this.f718y) {
                a.this.A.a(b.i.f729a);
            } else {
                a aVar = a.this;
                List<Purchase> purchasesList2 = purchasesResult.getPurchasesList();
                List<w> list = this.f719z;
                this.f716w = 2;
                if (aVar.f(purchasesList2, list, true, this) == c10) {
                    return c10;
                }
            }
            return wn.v.f59242a;
        }
    }

    public a(String str, String str2, BillingClient billingClient, Context context, q8.a aVar, MRLogger mRLogger, OtherFeaturesApi otherFeaturesApi) {
        jo.p.h(str, "signatureBase64");
        jo.p.h(str2, "referer");
        jo.p.h(billingClient, "billingClient");
        jo.p.h(context, "applicationContext");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRLogger, "logger");
        jo.p.h(otherFeaturesApi, "mirrativRequest");
        this.f700w = str;
        this.f701x = str2;
        this.f702y = billingClient;
        this.f703z = context;
        this.A = aVar;
        this.B = mRLogger;
        this.C = otherFeaturesApi;
        this.D = new da.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e9 A[Catch: Exception -> 0x003f, TryCatch #1 {Exception -> 0x003f, blocks: (B:13:0x003a, B:79:0x01dd, B:81:0x01e9, B:84:0x021a, B:86:0x0228, B:87:0x022f), top: B:98:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.util.List<? extends com.android.billingclient.api.Purchase> r15, java.util.List<ab.w> r16, boolean r17, ao.d<? super wn.v> r18) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.a.f(java.util.List, java.util.List, boolean, ao.d):java.lang.Object");
    }

    public final void g() {
        if (this.f702y.isReady()) {
            this.f702y.endConnection();
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.D.getCoroutineContext();
    }

    public final void h() {
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    public final void i(List<w> list, BillingResult billingResult, List<? extends Purchase> list2) {
        jo.p.h(list, "skuDetailsWithCoinProducts");
        jo.p.h(billingResult, "billingResult");
        if (billingResult.getResponseCode() == 0) {
            uo.l.d(this, null, null, new d(list2, list, null), 3, null);
        } else if (billingResult.getResponseCode() != 1) {
            g9.a aVar = g9.a.f32826a;
            aVar.b("onPurchasesUpdated() got resultCode: " + billingResult.getResponseCode(), new Object[0]);
        }
    }

    public final void j(int i10) {
        this.A.a(new b.g(i10));
    }

    public final void k(List<w> list, boolean z10) {
        jo.p.h(list, "skuDetailsWithCoinProducts");
        MRLogger mRLogger = this.B;
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_PAYMENT_RESTORE);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_WHERE, z10 ? TtmlNode.TEXT_EMPHASIS_AUTO : MRLog.TARGET_ID_TAP)));
        mRLogger.sendLog(builder.build());
        uo.l.d(this, null, null, new e(z10, list, null), 3, null);
    }

    public final void l(Activity activity, List<w> list, String str) {
        Object obj;
        SkuDetails b10;
        jo.p.h(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        jo.p.h(list, "skuDetailsWithCoinProducts");
        jo.p.h(str, "sku");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jo.p.c(((w) obj).b().getSku(), str)) {
                break;
            }
        }
        w wVar = (w) obj;
        if (wVar == null || (b10 = wVar.b()) == null) {
            return;
        }
        this.f702y.launchBillingFlow(activity, BillingFlowParams.newBuilder().setSkuDetails(b10).build());
    }

    public final boolean m(String str, String str2) {
        try {
            return xa.a.f59818a.c(this.f700w, str, str2);
        } catch (Exception e10) {
            g9.a.c(e10);
            return false;
        }
    }
}
