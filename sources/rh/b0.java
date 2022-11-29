package rh;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final s.g<String, String> f51398a = new s.g<>();

    /* renamed from: b  reason: collision with root package name */
    public static Locale f51399b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return xh.c.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(lh.b.common_google_play_services_notification_channel_name);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(lh.b.common_google_play_services_enable_button);
            }
            return resources.getString(lh.b.common_google_play_services_update_button);
        }
        return resources.getString(lh.b.common_google_play_services_install_button);
    }

    public static String d(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 != 1) {
            if (i10 == 2) {
                return vh.j.f(context) ? resources.getString(lh.b.common_google_play_services_wear_update_text) : resources.getString(lh.b.common_google_play_services_update_text, a10);
            } else if (i10 != 3) {
                if (i10 != 5) {
                    if (i10 != 7) {
                        if (i10 != 9) {
                            if (i10 != 20) {
                                switch (i10) {
                                    case 16:
                                        return h(context, "common_google_play_services_api_unavailable_text", a10);
                                    case 17:
                                        return h(context, "common_google_play_services_sign_in_failed_text", a10);
                                    case 18:
                                        return resources.getString(lh.b.common_google_play_services_updating_text, a10);
                                    default:
                                        return resources.getString(nh.i.f43556a, a10);
                                }
                            }
                            return h(context, "common_google_play_services_restricted_profile_text", a10);
                        }
                        return resources.getString(lh.b.common_google_play_services_unsupported_text, a10);
                    }
                    return h(context, "common_google_play_services_network_error_text", a10);
                }
                return h(context, "common_google_play_services_invalid_account_text", a10);
            } else {
                return resources.getString(lh.b.common_google_play_services_enable_text, a10);
            }
        }
        return resources.getString(lh.b.common_google_play_services_install_text, a10);
    }

    public static String e(Context context, int i10) {
        if (i10 != 6 && i10 != 19) {
            return d(context, i10);
        }
        return h(context, "common_google_play_services_resolution_required_text", a(context));
    }

    public static String f(Context context, int i10) {
        String g10;
        if (i10 == 6) {
            g10 = i(context, "common_google_play_services_resolution_required_title");
        } else {
            g10 = g(context, i10);
        }
        return g10 == null ? context.getResources().getString(lh.b.common_google_play_services_notification_ticker) : g10;
    }

    public static String g(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(lh.b.common_google_play_services_install_title);
            case 2:
                return resources.getString(lh.b.common_google_play_services_update_title);
            case 3:
                return resources.getString(lh.b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i10 = i(context, str);
        if (i10 == null) {
            i10 = resources.getString(nh.i.f43556a);
        }
        return String.format(resources.getConfiguration().locale, i10, str2);
    }

    public static String i(Context context, String str) {
        String str2;
        String str3;
        s.g<String, String> gVar = f51398a;
        synchronized (gVar) {
            Locale c10 = k3.d.a(context.getResources().getConfiguration()).c(0);
            if (!c10.equals(f51399b)) {
                gVar.clear();
                f51399b = c10;
            }
            String str4 = gVar.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources d10 = nh.f.d(context);
            if (d10 == null) {
                return null;
            }
            int identifier = d10.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = d10.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                gVar.put(str, string);
                return string;
            }
            if (str.length() != 0) {
                str2 = "Got empty resource: ".concat(str);
            } else {
                str2 = new String("Got empty resource: ");
            }
            Log.w("GoogleApiAvailability", str2);
            return null;
        }
    }
}
