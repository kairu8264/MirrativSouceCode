package ji;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.zzaq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f38055a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            k(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            j(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            String name = obj.getClass().getName();
            k(str, name.length() != 0 ? "Unexpected type for bundle response code: ".concat(name) : new String("Unexpected type for bundle response code: "));
            return 6;
        }
    }

    public static Bundle b(AcknowledgePurchaseParams acknowledgePurchaseParams, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static Bundle c(ConsumeParams consumeParams, boolean z10, String str) {
        Bundle bundle = new Bundle();
        if (z10) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    public static Bundle d(int i10, boolean z10, String str, String str2, ArrayList<zzaq> arrayList) {
        Bundle bundle = new Bundle();
        if (i10 >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i10 >= 9 && z10) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i10 >= 14) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            int size = arrayList.size();
            boolean z11 = false;
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.get(i11);
                arrayList2.add(null);
                z11 |= !TextUtils.isEmpty(null);
            }
            if (z11) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
        }
        return bundle;
    }

    public static Bundle e(BillingFlowParams billingFlowParams, boolean z10, boolean z11, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (billingFlowParams.zzb() != 0) {
            bundle.putInt(BillingFlowParams.EXTRA_PARAM_KEY_REPLACE_SKUS_PRORATION_MODE, billingFlowParams.zzb());
        }
        if (!TextUtils.isEmpty(billingFlowParams.zzf())) {
            bundle.putString(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, billingFlowParams.zzf());
        }
        if (!TextUtils.isEmpty(billingFlowParams.zzg())) {
            bundle.putString("obfuscatedProfileId", billingFlowParams.zzg());
        }
        if (billingFlowParams.getVrPurchaseFlow()) {
            bundle.putBoolean(BillingFlowParams.EXTRA_PARAM_KEY_VR, true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList(BillingFlowParams.EXTRA_PARAM_KEY_OLD_SKUS, new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(billingFlowParams.zzh())) {
            bundle.putString(BillingFlowParams.EXTRA_PARAM_KEY_OLD_SKU_PURCHASE_TOKEN, billingFlowParams.zzh());
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z10 && z11) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static Bundle f(boolean z10, boolean z11, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z10 && z11) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static BillingResult g(Intent intent, String str) {
        if (intent == null) {
            k("BillingHelper", "Got null intent!");
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(6);
            newBuilder.setDebugMessage("An internal error occurred.");
            return newBuilder.build();
        }
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(a(intent.getExtras(), str));
        newBuilder2.setDebugMessage(h(intent.getExtras(), str));
        return newBuilder2.build();
    }

    public static String h(Bundle bundle, String str) {
        if (bundle == null) {
            k(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            j(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            String name = obj.getClass().getName();
            k(str, name.length() != 0 ? "Unexpected type for debug message: ".concat(name) : new String("Unexpected type for debug message: "));
            return "";
        }
    }

    public static List<Purchase> i(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
                Purchase l10 = l(stringArrayList.get(i10), stringArrayList2.get(i10));
                if (l10 != null) {
                    arrayList.add(l10);
                }
            }
        } else {
            k("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            Purchase l11 = l(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (l11 == null) {
                k("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(l11);
        }
        return arrayList;
    }

    public static void j(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void k(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static Purchase l(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                sb2.append("Got JSONException while parsing purchase data: ");
                sb2.append(valueOf);
                k("BillingHelper", sb2.toString());
                return null;
            }
        }
        k("BillingHelper", "Received a bad purchase data.");
        return null;
    }
}
