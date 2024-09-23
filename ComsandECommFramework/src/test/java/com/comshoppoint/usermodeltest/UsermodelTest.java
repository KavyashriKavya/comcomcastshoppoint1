package com.comshoppoint.usermodeltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shoppoint.generic.Fileutility.ExcelUtility;
import com.shoppoint.generic.objectrepository.Bookspage;
import com.shoppoint.generic.objectrepository.Electronicspage;
import com.shoppoint.generic.objectrepository.Homepage;
import com.shoppoint.generic.objectrepository.Myaccountpage;
import com.shoppoint.generic.objectrepository.Mycartpage;
import com.shoppoint.generic.objectrepository.paymentpage;
import com.shoppoint.generic.objectrepository.productpage;
import com.shoppoint.generic.objectrepository.wishlistpage;
import com.shoppoint.generic.webdriverutility.WebdriverUtility;
import com.shoppoint.genericutility.Baseclass;

public class UsermodelTest extends Baseclass {
	
	//public class AddingmultipleproducttocartTest extends Baseclass {

		@Test
			public void addingMultipleproductotocart() throws Exception {
		
				// click on books
		
				Homepage h = new Homepage(driver);
				h.getBookslink().click();
		
				// click on comics
				Bookspage bp = new Bookspage(driver);
				bp.getComicslink().click();
		
				// select one book and click on like icon
				ExcelUtility eLib = new ExcelUtility();
				String aproductname = eLib.getDataFromExcelFile("productpage", 2, 3);
				System.out.println(aproductname );
		
				WebdriverUtility wLib = new WebdriverUtility();
				wLib.Toscroll(driver, 0, 500);
		
				driver.findElement(By.xpath("//a[text()='"+aproductname +"']")).click();
				//wLib.Toscroll(driver, 0, 200);
				
				productpage p=new productpage(driver);
				wLib.Toscroll(driver, 0, 200);
				p.getAddtocartlink().click();
				wLib.switchToAlertAccept(driver);
				
				//h.getMycartlink().click();
				//sSystem.out.println(aproductname);
				 wLib.Toscroll(driver, 0, 200);
				Mycartpage mp=new Mycartpage(driver);
				mp.getContinueshippinglink().click();
				
				h.getElectronicslink().click();
				
				Electronicspage ep = new Electronicspage(driver);
				ep.getMobileslinks().click();
				
				String actualproduct = eLib.getDataFromExcelFile("productpage", 4, 3);
				System.out.println(actualproduct);

				//WebdriverUtility wLib = new WebdriverUtility();
				wLib.Toscroll(driver, 0, 500);
				
		        
				driver.findElement(By.xpath("//a[text()='"+ actualproduct+"']")).click();
				//wLib.switchToAlertAccept(driver);
				
				p.getAddtocartlink().click();
				wLib.switchToAlertAccept(driver);
				
		}
				
				
				@Test
				public void Tocheckorderhistory1() throws Exception {

					// click on books

					Homepage h = new Homepage(driver);
					h.getBookslink().click();

					// click on comics
					Bookspage bp = new Bookspage(driver);
					bp.getComicslink().click();

					// select one book and click on like icon
					ExcelUtility eLib = new ExcelUtility();
					String aproductname = eLib.getDataFromExcelFile("productpage", 2, 3);
					System.out.println(aproductname );

					WebdriverUtility wLib = new WebdriverUtility();
					wLib.Toscroll(driver, 0, 500);

					driver.findElement(By.xpath("//a[text()='"+aproductname +"']")).click();
					//wLib.Toscroll(driver, 0, 200);
					
					productpage p=new productpage(driver);
					wLib.Toscroll(driver, 0, 200);
					p.getAddtocartlink().click();
					wLib.switchToAlertAccept(driver);
					
					h.getMycartlink().click();
					System.out.println(aproductname);
				//	String eperesut="Thea Stilton and the Tropical Treasure ";
				  //  Assert.assertEquals(aproductname, eperesut);
				}
				    
				    @Test
				    
				    public void purchaseProductWithCashOndelivertTest() throws Exception {

						// click on books

						Homepage h = new Homepage(driver);
						h.getBookslink().click();

						// click on comics
						Bookspage bp = new Bookspage(driver);
						bp.getComicslink().click();

						// select one book and click on like icon
						ExcelUtility eLib = new ExcelUtility();
						String data = eLib.getDataFromExcelFile("productpage", 2, 3);
						System.out.println(data);

						WebdriverUtility wLib = new WebdriverUtility();
						wLib.Toscroll(driver, 0, 500);

						driver.findElement(By.xpath("//a[text()='" + data + "']")).click();
						wLib.Toscroll(driver, 0, 200);
						productpage p = new productpage(driver);
						p.getWishlisticon().click();

						
						//click on add to cart button
						
						wishlistpage w = new wishlistpage(driver);
						w.getAddtocartbutton().click();
						wLib.waitForPageToLoad(driver);
						
						//navigate to my cart link
						h.getMycartlink().click();
						Thread.sleep(2000);

						//Enter the billing and shipping details
						Mycartpage mp = new Mycartpage(driver);

						mp.Setshippingaddress("BTM", "karnataka", "banglore", "583119");
						Thread.sleep(2000);
						mp.Setbillingaddress("HSR", "karnataka", "banglore", "583119");
						Thread.sleep(2000);

						//To click on proceed to checkout button
						mp.getProceedtocheckoutlink().click();
						paymentpage pp = new paymentpage(driver);
						
						//To select the payment
						pp.getCodradiobutton().click();
						pp.getSubmitbutton().click();
				    }

						
						@Test
						public void RemoveproductFromCart() throws Exception {

							// click on books

							Homepage h = new Homepage(driver);
							h.getBookslink().click();

							// click on comics
							Bookspage bp = new Bookspage(driver);
							bp.getComicslink().click();

							// select one book and click on add to cart
							ExcelUtility eLib = new ExcelUtility();
							String data = eLib.getDataFromExcelFile("productpage", 2, 3);
							System.out.println(data);

							WebdriverUtility wLib = new WebdriverUtility();
							wLib.Toscroll(driver, 0, 500);

							driver.findElement(By.xpath("//a[text()='" + data + "']")).click();
							wLib.Toscroll(driver, 0, 200);
							
							
							productpage p = new productpage(driver);
							p.getWishlisticon().click();

							
							//click on add to cart button
							
							wishlistpage w = new wishlistpage(driver);
							w.getAddtocartbutton().click();
							wLib.waitForPageToLoad(driver);
							
							//navigate to my cart link
							h.getMycartlink().click();
							//Thread.sleep(2000);
							
							driver.findElement(By.xpath("(//a[text()='"+data+"'])[2]/../../..//input[@type='checkbox']")).click();
							
							Mycartpage mp = new Mycartpage(driver);
							wLib.Toscroll(driver, 0, 1000);
							mp.getUpdateshoppingcartlink().click();
							//wLib.switchToAlertAccept(driver);
							//wLib.switchToAlertAccept(driver);
						}
							
							
							@Test
							public void Tracktheorder1() throws Exception {

								// click on electronics
						      	Homepage h=new Homepage(driver);
								h.getElectronicslink().click();

								// click on mobile
								Electronicspage ep = new Electronicspage(driver);
								ep.getMobileslinks().click();

								// select one iphone  and click on like icon
								ExcelUtility eLib = new ExcelUtility();
								String data = eLib.getDataFromExcelFile("productpage", 4, 3);
								System.out.println(data);

								WebdriverUtility wLib = new WebdriverUtility();
								wLib.Toscroll(driver, 0, 500);
								
						        
								driver.findElement(By.xpath("//a[text()='" + data + "']")).click();
								wLib.Toscroll(driver, 0, 200);
								productpage p = new productpage(driver);
								p.getWishlisticon().click();
								
								//To click on x icon 
								driver.findElement(By.xpath("//a[text()='"+data+"']/../../..//i[@class='fa fa-times']")).click();
								wLib.switchToAlertAccept(driver);
							}
								
								
								
								public void Tocheckorderhistory() throws Exception {

									// click on books

									Homepage h = new Homepage(driver);
									h.getBookslink().click();

									// click on comics
									Bookspage bp = new Bookspage(driver);
									bp.getComicslink().click();

									// select one book and click on like icon
									ExcelUtility eLib = new ExcelUtility();
									String data = eLib.getDataFromExcelFile("productpage", 2, 3);
									System.out.println(data);

									WebdriverUtility wLib = new WebdriverUtility();
									wLib.Toscroll(driver, 0, 500);

									driver.findElement(By.xpath("//a[text()='" + data + "']")).click();
									wLib.Toscroll(driver, 0, 200);
									productpage p = new productpage(driver);
									p.getWishlisticon().click();

									
									//click on add to cart button
									
									wishlistpage w = new wishlistpage(driver);
									w.getAddtocartbutton().click();
									wLib.waitForPageToLoad(driver);
									
									//navigate to my cart link
									h.getMycartlink().click();
									Thread.sleep(2000);

									//Enter the billing and shipping details
									Mycartpage mp = new Mycartpage(driver);

									mp.Setshippingaddress("BTM", "karnataka", "banglore", "583119");
									Thread.sleep(2000);
									mp.Setbillingaddress("HSR", "karnataka", "banglore", "583119");
									Thread.sleep(2000);

									//To click on proceed to checkout button
									mp.getProceedtocheckoutlink().click();
									paymentpage pp = new paymentpage(driver);
									
									//To select the payment
									pp.getCodradiobutton().click();
									pp.getSubmitbutton().click();
									
									//To click on my account link
									h.getMyaccountlink().click();
									
									//To click on order history link
									Myaccountpage mal = new Myaccountpage(driver);
									mal.getOrderhistorylink().click();
									
									String aresu = driver.findElement(By.xpath("//a[contains(text(),'"+data+"')]")).getText();
									System.out.println(aresu);
									String eperesut=eLib.getDataFromExcelFile("productpage",2,5 );
									System.out.println(eperesut);
								    Assert.assertEquals(aresu, eperesut);
								}
									
								    @Test
									public void Tracktheorder() throws Exception {

										// click on books

										Homepage h = new Homepage(driver);
										h.getBookslink().click();

										// click on comics
										Bookspage bp = new Bookspage(driver);
										bp.getComicslink().click();

										// select one book and click on like icon
										ExcelUtility eLib = new ExcelUtility();
										String data = eLib.getDataFromExcelFile("productpage", 2, 3);
										System.out.println(data);

										WebdriverUtility wLib = new WebdriverUtility();
										wLib.Toscroll(driver, 0, 500);

										driver.findElement(By.xpath("//a[text()='" + data + "']")).click();
										wLib.Toscroll(driver, 0, 200);
										productpage p = new productpage(driver);
										p.getWishlisticon().click();

										
										//click on add to cart button
										
										wishlistpage w = new wishlistpage(driver);
										w.getAddtocartbutton().click();
										wLib.waitForPageToLoad(driver);
										
										//navigate to my cart link
										h.getMycartlink().click();
										Thread.sleep(2000);

										//Enter the billing and shipping details
										Mycartpage mp = new Mycartpage(driver);

										mp.Setshippingaddress("BTM", "karnataka", "banglore", "583119");
										Thread.sleep(2000);
										mp.Setbillingaddress("HSR", "karnataka", "banglore", "583119");
										Thread.sleep(2000);

										//To click on proceed to checkout button
										mp.getProceedtocheckoutlink().click();
										paymentpage pp = new paymentpage(driver);
										
										//To select the payment
										pp.getCodradiobutton().click();
										pp.getSubmitbutton().click();
										
								        //To click on track link
										//h.getTrackorderlink().click();
										//wLib.Toscroll(driver, 0, 500);
										
										//Enter the id and email
										//Trackorderpage tp = new Trackorderpage(driver);
										//tp.Trackorder("6", "parthibhan9611@123");
										wLib.Toscroll(driver, 0, 3000);
										driver.findElement(By.xpath("//a[contains(text(),'"+data+"')]/../../..//a[@title='Track order']")).click();
								    }
										
										@Test
										public void Updateproductintocart() throws Exception {

											// click on books

											Homepage h = new Homepage(driver);
											h.getBookslink().click();

											// click on comics
											Bookspage bp = new Bookspage(driver);
											bp.getComicslink().click();

											// select one book and click on like icon
											ExcelUtility eLib = new ExcelUtility();
											String aproductname = eLib.getDataFromExcelFile("productpage", 2, 3);
											System.out.println(aproductname );

											WebdriverUtility wLib = new WebdriverUtility();
											wLib.Toscroll(driver, 0, 500);

											driver.findElement(By.xpath("//a[text()='"+aproductname +"']")).click();
											//wLib.Toscroll(driver, 0, 200);
											
											productpage p=new productpage(driver);
											wLib.Toscroll(driver, 0, 200);
											p.getAddtocartlink().click();
											wLib.switchToAlertAccept(driver);
											
											h.getMycartlink().click();
											System.out.println(aproductname);
											String expectedproductname="Thea Stilton and the Tropical Treasure ";
										    Assert.assertEquals(aproductname, expectedproductname);
										    
										    
										    //update quantity
										   WebElement quantity = driver.findElement(By.xpath("(//a[text()='"+aproductname+"'])[2]/../../..//input[@type='text']"));
										   quantity.clear();
										   String actualquantity = eLib.getDataFromExcelFile("productpage", 2, 4);
										   
										   quantity.sendKeys(actualquantity );
										   
										   
										   //To click on update shopping cart button
										   Mycartpage mp=new Mycartpage(driver);
										   wLib.Toscroll(driver, 0, 200);
										   mp.getUpdateshoppingcartlink().click();
										 //  wLib.switchToAlertAccept(driver);
										   
										   
										  //To click on my cart link
										 // h.getMycartlink().click();
										  
										  //validating actualquantity and updatedquantity
										 String expectedquantity=driver.findElement(By.xpath("(//a[text()='"+aproductname+"'])[2]/../../..//input[@type='text']")).getAttribute("value");
										 System.out.println(expectedquantity);
									      Assert.assertEquals(actualquantity, expectedquantity);	
										}
	}
										   
								

