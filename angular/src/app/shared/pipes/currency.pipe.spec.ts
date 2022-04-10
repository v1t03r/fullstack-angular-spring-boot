import { CurrencyPipe } from './currency.pipe';

describe('CategoryPipe', () => {
  it('create an instance', () => {
    const pipe = new CurrencyPipe();
    expect(pipe).toBeTruthy();
  });
});
