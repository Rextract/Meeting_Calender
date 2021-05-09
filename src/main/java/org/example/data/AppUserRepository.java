package org.example.data;

import org.example.Models.AppUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AppUserRepository {


    private static final AppUserRepository INSTANCE;

    static {
        INSTANCE = new AppUserRepository();
    }

    public static AppUserRepository getInstance(){
        return INSTANCE;
    }

    private AppUserRepository(){
      List<AppUser> appUsers = new ArrayList<AppUser>();
        appUsers = null;
    }
    //END of singleton no more static



    private List<AppUser> appUserStorage;



    public List<AppUser> findAll(){
        return findAll();
    }

    public AppUser findById (int AppUser){
        return getInstance().findById(AppUser);

    }

    public AppUser findByUsername(String AppUser){
        return findByUsername(AppUser);
    }

    public int getAppUserCount(){
        return getAppUserCount();
    }

    public AppUser persist(AppUser persist){
        return persist;
    }

    public boolean remove(int remove){
        return true;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUserRepository that = (AppUserRepository) o;
        return Objects.equals(appUserStorage, that.appUserStorage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appUserStorage);
    }
}
