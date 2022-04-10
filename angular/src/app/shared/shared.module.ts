import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AppMaterialModule } from './app-material/app-material.module';
import { ErrorDialogComponent } from './components/error-dialog/error-dialog.component';
import { CurrencyPipe } from './pipes/currency.pipe';

@NgModule({
  declarations: [
    ErrorDialogComponent,
    CurrencyPipe
  ],
  imports: [
    CommonModule,
    AppMaterialModule
  ],
  exports: [
    ErrorDialogComponent,
    CurrencyPipe
  ]
})
export class SharedModule { }
