import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LeftSlideBarComponent } from './left-slide-bar/left-slide-bar.component';
import { AppRoutingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './material/material.module';
import { FormsModule, NgSelectOption, ReactiveFormsModule } from '@angular/forms';
import { PossupportComponent } from './posWeb/possupport/possupport.component';
import { PoscontactsComponent } from './posWeb/poscontacts/poscontacts.component';
import { PoshomeComponent } from './posWeb/poshome/poshome.component';
import { PosnewsComponent } from './posWeb/posnews/posnews.component';
import { PosproductsComponent } from './posproducts/posproducts.component';
import { PosproductlistComponent } from './posproductlist/posproductlist.component';
import { PosmanagementComponent } from './posWeb/posnews/posmanagement/posmanagement.component';
import { PoswhorareweComponent } from './posWeb/poswhorarewe/poswhorarewe.component';
import { PosusefulllinksComponent } from './posWeb/posusefulllinks/posusefulllinks.component';
import { PosdatabaseComponent } from './posWeb/posdatabase/posdatabase.component';
import { PoscookiesComponent } from './posWeb/poscookies/poscookies.component';
import { PrivacypolicyComponent } from './privacypolicy/privacypolicy.component';
import { PosprivacyComponent } from './posWeb/posprivacy/posprivacy.component';
import { WhoareweComponent } from './whoarewe/whoarewe.component';
import { DatabaseComponent } from './database/database.component';
import { CookiesComponent } from './cookies/cookies.component';
import { ManagementComponent } from './management/management.component';
import { UsefulllinksComponent } from './usefulllinks/usefulllinks.component';
import { MatConfirmDialogComponent } from './mat-confirm-dialog/mat-confirm-dialog.component';
import { MatDialogRef } from '@angular/material/dialog';
import { DatePipe } from '@angular/common';
import { RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { BoardUserComponent } from './board-user/board-user.component';
import { BoardAdminComponent } from './board-admin/board-admin.component';
import { BoardModeratorComponent } from './board-moderator/board-moderator.component';
import { ProfileComponent } from './profile/profile.component';
import { authInterceptorProviders } from './_helpers/auth.interceptor';
import { NgxCaptchaModule } from 'ngx-captcha';
import { CompanybusinessComponent } from './companybusiness/companybusiness.component';
import { CompanyListComponent } from './companybusiness/company-list/company-list.component';
import { CompanyAddComponent } from './companybusiness/company-add/company-add.component';
import { AccountComponent } from './account/account.component';
import { AccountEditComponent } from './account/account-edit/account-edit.component';
import { AccountListComponent } from './account/account-list/account-list.component';
import { AccountViewComponent } from './account/account-view/account-view.component';
import { AgendaService, DayService, MonthAgendaService, MonthService, ScheduleModule, TimelineMonthService, TimelineViewsService, WeekService, WorkWeekService } from '@syncfusion/ej2-angular-schedule';
import { SimpleNotificationsModule } from 'angular2-notifications';
import { CompanyViewComponent } from './companybusiness/company-view/company-view.component';
import { CookiesV2Component } from './cookies-v2/cookies-v2.component';
import { AngularEditorModule } from '@kolkov/angular-editor';
import { PosproductlistViewComponent } from './posproductlist/posproductlist-view/posproductlist-view.component';
import { PosproductlistAddComponent} from './posproductlist/posproductlist-add/posproductlist-add.component';
import { PosListComponent } from './posproductlist/pos-list/pos-list.component';
import { PlateformeComponent } from './plateforme/plateforme.component';
import { PlateformeListComponent } from './plateforme/plateforme-list/plateforme-list.component';
import { PlateformeViewComponent } from './plateforme/plateforme-view/plateforme-view.component';
import { PlateformeAddComponent } from './plateforme/plateforme-add/plateforme-add.component';
import { NgxSpinnerModule } from "ngx-spinner"; 
import { CKEditorModule } from 'ckeditor4-angular';
import { ProductAddComponent } from './posproducts/product-add/product-add.component';
import { ProductListComponent } from './posproducts/product-list/product-list.component';
import { RolesComponent } from './roles/roles.component';
import { RolesAddComponent } from './roles/roles-add/roles-add.component';
import { RolesListComponent } from './roles/roles-list/roles-list.component';
import { RolesViewComponent } from './roles/roles-view/roles-view.component';
import { NgSelectModule } from '@ng-select/ng-select';
import { PosactualityComponent } from './posWeb/posactuality/posactuality.component';
import { PosdealersComponent } from './posWeb/posdealers/posdealers.component';
import { HomewelcometextComponent } from './pages/homewelcometext/homewelcometext.component';
import { HomenewslistComponent } from './pages/homenewslist/homenewslist.component';
import { HomescustomerlogosComponent } from './pages/homescustomerlogos/homescustomerlogos.component';
import { HomelistComponent } from './pages/homelist/homelist.component';
import { HomeprimaryslideComponent } from './pages/homeprimaryslide/homeprimaryslide.component';
import { ResetpasswordComponent } from './resetpassword/resetpassword.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LeftSlideBarComponent,
    PossupportComponent,
    PoscontactsComponent,
    PoshomeComponent,
    PosactualityComponent,
    PosnewsComponent,
    PosproductsComponent,
    PosproductlistComponent,
    PosmanagementComponent,
    PosdealersComponent,
    PoswhorareweComponent,
    PosusefulllinksComponent,
    PosdatabaseComponent,
    PoscookiesComponent,
    PrivacypolicyComponent,
    PosprivacyComponent,
    HomewelcometextComponent,
    HomenewslistComponent,
    HomescustomerlogosComponent,
    HomelistComponent,
    HomeprimaryslideComponent,
    WhoareweComponent,
    DatabaseComponent,
    CookiesComponent,
    ManagementComponent,
    UsefulllinksComponent,
    MatConfirmDialogComponent,
    LoginComponent,
    RegisterComponent,
    BoardUserComponent,
    BoardAdminComponent,
    BoardModeratorComponent,
    ProfileComponent,
    CompanybusinessComponent,
    CompanyListComponent,
    CompanyAddComponent,
    AccountComponent,
    AccountEditComponent,
    AccountListComponent,
    AccountViewComponent,
    CompanyViewComponent,
    CookiesV2Component,
    PosproductlistViewComponent,
    PosproductlistAddComponent,
    PosListComponent,
    PlateformeComponent,
    PlateformeListComponent,
    PlateformeViewComponent,
    PlateformeAddComponent,
    ProductAddComponent,
    ProductListComponent,
    RolesComponent,
    RolesAddComponent,
    RolesListComponent,
    RolesViewComponent,
    ResetpasswordComponent,
  
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule,
    AppRoutingModule,
    NgxCaptchaModule,
    FormsModule, 
    ScheduleModule, 
    SimpleNotificationsModule.forRoot(),
    AngularEditorModule,
    NgxSpinnerModule,
    CKEditorModule,
    NgSelectModule
    


  ],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
  exports: [MaterialModule, ScheduleModule,NgxSpinnerModule,NgSelectModule],
  providers: [
    {provide: MatDialogRef, useValue: {close: (_dialogResult: any) => { }} }, DatePipe, authInterceptorProviders,DayService, WeekService, WorkWeekService, MonthService, AgendaService, MonthAgendaService, TimelineViewsService, TimelineMonthService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }