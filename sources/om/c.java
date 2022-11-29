package om;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c extends HttpURLConnection {

    /* renamed from: a  reason: collision with root package name */
    public final e f45473a;

    public c(HttpURLConnection httpURLConnection, sm.h hVar, mm.d dVar) {
        super(httpURLConnection.getURL());
        this.f45473a = new e(httpURLConnection, hVar, dVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f45473a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.f45473a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f45473a.c();
    }

    public boolean equals(Object obj) {
        return this.f45473a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f45473a.d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f45473a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.f45473a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f45473a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f45473a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f45473a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f45473a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f45473a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f45473a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f45473a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f45473a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f45473a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f45473a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f45473a.r(i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f45473a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f45473a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f45473a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f45473a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f45473a.x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f45473a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.f45473a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f45473a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f45473a.B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.f45473a.C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.f45473a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f45473a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f45473a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f45473a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f45473a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.f45473a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.f45473a.J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f45473a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f45473a.L();
    }

    public int hashCode() {
        return this.f45473a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f45473a.M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f45473a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f45473a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f45473a.P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f45473a.Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f45473a.R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f45473a.S(i10);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f45473a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f45473a.V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f45473a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.f45473a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f45473a.Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f45473a.Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f45473a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f45473a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.f45473a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f45473a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f45473a.T(j10);
    }
}
