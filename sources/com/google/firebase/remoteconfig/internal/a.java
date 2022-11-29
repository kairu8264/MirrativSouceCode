package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: f  reason: collision with root package name */
    public static final Date f28030f = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f28031a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f28032b;

    /* renamed from: c  reason: collision with root package name */
    public Date f28033c;

    /* renamed from: d  reason: collision with root package name */
    public JSONArray f28034d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f28035e;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f28036a;

        /* renamed from: b  reason: collision with root package name */
        public Date f28037b;

        /* renamed from: c  reason: collision with root package name */
        public JSONArray f28038c;

        /* renamed from: d  reason: collision with root package name */
        public JSONObject f28039d;

        public a a() throws JSONException {
            return new a(this.f28036a, this.f28037b, this.f28038c, this.f28039d);
        }

        public b b(JSONObject jSONObject) {
            try {
                this.f28036a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b c(JSONArray jSONArray) {
            try {
                this.f28038c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(Date date) {
            this.f28037b = date;
            return this;
        }

        public b e(JSONObject jSONObject) {
            try {
                this.f28039d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b() {
            this.f28036a = new JSONObject();
            this.f28037b = a.f28030f;
            this.f28038c = new JSONArray();
            this.f28039d = new JSONObject();
        }
    }

    public static a b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new a(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public static b g() {
        return new b();
    }

    public JSONArray c() {
        return this.f28034d;
    }

    public JSONObject d() {
        return this.f28032b;
    }

    public Date e() {
        return this.f28033c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f28031a.toString().equals(((a) obj).toString());
        }
        return false;
    }

    public JSONObject f() {
        return this.f28035e;
    }

    public int hashCode() {
        return this.f28031a.hashCode();
    }

    public String toString() {
        return this.f28031a.toString();
    }

    public a(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f28032b = jSONObject;
        this.f28033c = date;
        this.f28034d = jSONArray;
        this.f28035e = jSONObject2;
        this.f28031a = jSONObject3;
    }
}
