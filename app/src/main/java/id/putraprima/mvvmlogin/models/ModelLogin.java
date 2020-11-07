package id.putraprima.mvvmlogin.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelLogin implements Parcelable {
    String password = "livia";
    String username = "kliviayurike@gmail.com";

    public ModelLogin() {
    }

    public ModelLogin(String password, String username) {
        this.password = password;
        this.username = username;
    }

    protected ModelLogin(Parcel in) {
        password = in.readString();
        username = in.readString();
    }

    public static final Creator<ModelLogin> CREATOR = new Creator<ModelLogin>() {
        @Override
        public ModelLogin createFromParcel(Parcel in) {
            return new ModelLogin(in);
        }

        @Override
        public ModelLogin[] newArray(int size) {
            return new ModelLogin[size];
        }
    };

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(password);
        parcel.writeString(username);
    }
}
