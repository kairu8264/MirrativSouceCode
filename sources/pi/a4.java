package pi;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f47579a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f47580b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f47581c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g4 f47582d;

    public a4(g4 g4Var, String str, Bundle bundle) {
        this.f47582d = g4Var;
        rh.p.e("default_event_parameters");
        this.f47579a = "default_event_parameters";
        this.f47580b = new Bundle();
    }

    public final Bundle a() {
        char c10;
        if (this.f47581c == null) {
            String string = this.f47582d.m().getString(this.f47579a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString(TopicConstant.EXTEND_AVC_NDR);
                            String string3 = jSONObject.getString(TopicConstant.PACKET_TYPE_TEXT);
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c10 = 1;
                                }
                                c10 = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c10 = 0;
                                }
                                c10 = 65535;
                            } else {
                                if (string3.equals("l")) {
                                    c10 = 2;
                                }
                                c10 = 65535;
                            }
                            if (c10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c10 != 2) {
                                this.f47582d.f48285a.r().p().b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f47582d.f48285a.r().p().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f47581c = bundle;
                } catch (JSONException unused2) {
                    this.f47582d.f48285a.r().p().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f47581c == null) {
                this.f47581c = this.f47580b;
            }
        }
        return this.f47581c;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f47582d.m().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f47579a);
        } else {
            String str = this.f47579a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(TopicConstant.EXTEND_AVC_NDR, str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put(TopicConstant.PACKET_TYPE_TEXT, "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put(TopicConstant.PACKET_TYPE_TEXT, "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put(TopicConstant.PACKET_TYPE_TEXT, "d");
                        } else {
                            this.f47582d.f48285a.r().p().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        this.f47582d.f48285a.r().p().b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f47581c = bundle;
    }
}
