package com.mindhub.Lollapalooza;

import com.mindhub.Lollapalooza.models.Product;
import com.mindhub.Lollapalooza.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.swing.*;

@SpringBootApplication
public class LollapaloozaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LollapaloozaApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(ProductRepository productRepository){
		return(args) -> {
			Product RemeraLogoVibes = productRepository.save(new Product("Remera Lolla Logo Vibes",1890.0,"Remera","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135701-c7f1c684c312f86fb715959866423406-640-0.jpg"));

			Product RemeraBand = productRepository.save(new Product("Remera Lolla Band",1890.0,"Remera","",27,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135291-cd90a76a58b259cf1215959873728285-640-0.jpg"));
			Product RemeraMain = productRepository.save(new Product("Remera Lolla Main",1890.0,"Remera","",93,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135461-581c05db4c94d16eea15959873265224-640-0.jpg"));
			Product RemeraMusic = productRepository.save(new Product("Remera Lolla Music",1890.0,"Remera","",9,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135671-c35bab1e9a71720ecd15959872334113-1024-1024.jpg"));
			Product RemeraMultiPride = productRepository.save(new Product("Remera Lolla Multi Pride",1890.0,"Remera","",50,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135631-10a533a930b3c5ebde15959870535164-1024-1024.jpg"));
			Product RemeraTvSpiral = productRepository.save(new Product("Remera Lolla Tv Spiral",1890.0,"Remera","",50,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135551-15b7cb05c138314ee115959867242967-1024-1024.jpg"));
			Product RemeraHeadphones = productRepository.save(new Product("Remera Lolla Headphones",1890.0,"Remera","",43,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135341-09f44b40bb73fd5e2215959871790968-1024-1024.jpg"));
			Product RemeraShapes = productRepository.save(new Product("Remera Lolla Shapes",1890.0,"Remera","",7,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135191-032146c6e713b1f28a15959869953160-1024-1024.jpg"));
			Product AccesorioPinLogo= productRepository.save(new Product("Pin Lolla Logo",290,"Pin","",31,"https://d2r9epyceweg5n.cloudfront.net/assets/themes/idea/static/images/empty-placeholder.png?802389227"));
			Product AccesorioPilusoMixNegro= productRepository.save(new Product("Piluso Lolla Mix Negro",1490.0,"Piluso","",65,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo131541-c3ce36ac30201e480615959840839887-1024-1024.jpg"));
			Product AccesorioMaskMix= productRepository.save(new Product("Lolla Mask Mix",590.0,"Mask","",4,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/seg-foto-accesorio-8-de-julio357661-0d5bf313a118da5e1b15959788940663-1024-1024.jpg"));

<<<<<<< HEAD

=======
>>>>>>> 00666c1e28bc0fb2f0a3d2b47e0e1879fa926b75
			Product AccesorioMaskTieDye= productRepository.save(new Product("Lolla Mask Tie Dye",590,"Mask","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/barbijo-21-1984f2d6251bd2aece15961159294100-1024-1024.jpg"));
			Product AccesorioMaskElectric= productRepository.save(new Product("Lolla Mask Electric",590,"Mask","",2,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/seg-foto-accesorio-8-de-julio357721-11fa8948870a9f37ba15959798841171-1024-1024.jpg"));
			Product AccesorioMaskPride= productRepository.save(new Product("Lolla Mask Pride",590,"Mask","",19,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/seg-foto-accesorio-8-de-julio357831-58725edcd02ebcb23815959796841195-1024-1024.jpg"));
			Product AccesorioRinoneraMix= productRepository.save(new Product("Riñonera Lolla Mix",990,"Riñonera","",13,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo132511-c383d3942f257f97c915959835091447-1024-1024.jpg"));
			Product AccesorioGorraRound= productRepository.save(new Product("Gorra Lolla Round",1790.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo131511-184a6abbf7d64f771515959858132834-1024-1024.jpg"));
			Product AccesorioPinMystery= productRepository.save(new Product("Pin Lolla Mystery",290,"Pin","",43,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo129161-f5afbeec21dcc3b05415959767263287-1024-1024.jpg"));
			Product AccesorioPinElectric= productRepository.save(new Product("Pin Lolla Electric",290,"Pin","",50,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo129061-27757f24fb0719500815959762995566-1024-1024.jpg"));
			Product AccesorioGorraHeadphones= productRepository.save(new Product("Gorra Lolla Headphones",1790.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo131291-c15436a51df378ce8215959856260239-1024-1024.jpg"));
			Product AccesorioPilusoMixVerde= productRepository.save(new Product("Piluso Lolla Mix Verde",1490.0,"Piluso","",40,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo131581-c517f953e1914ddbd615959841306716-1024-1024.jpg"));
			Product AccesorioBandoleraMix= productRepository.save(new Product("Bandolera Lolla Mix",1890.0,"Bandolera","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo133281-eaa574ea4a8c60a00415959832733497-640-0.jpg"));
			Product AccesorioBandoleraMixNegra= productRepository.save(new Product("Bandolera Lolla Mix Negra",1890.0,"Bandolera","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo132851-e962fd9e4fc38d4f7815959830294687-640-0.jpg"));
			Product AccesorioStickersSpiral= productRepository.save(new Product("Set Stickers Lolla Spiral",360,"Stickers","",20,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo129681-84ea26f4439b5e925615959825071007-640-0.jpg"));
			Product AccesorioMaskVioleta= productRepository.save(new Product("Lolla Mask Violeta",590,"Mask","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/seg-foto-accesorio-8-de-julio357701-501d9938c0783f462115959794523248-640-0.jpg"));
			Product AccesorioBandanaPride= productRepository.save(new Product("Bandana Lolla Pride",590,"Bandana","",10,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo131761-1605add398ec8c352415959690535649-640-0.jpg"));
			Product AccesorioGorraGrey= productRepository.save(new Product("Gorra Lolla Grey",1790.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo131411-e6d0510acf5d7a836c15959857287477-640-0.jpg"));
			Product AccesorioGorraElectric= productRepository.save(new Product("Gorra Lolla Electric",1990.0,"Gorra","",9,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo131051-e20de35c16370165f215959851309380-640-0.jpg"));
			Product AccesorioStickersMusic= productRepository.save(new Product("Set Stickers Lolla Music",360,"Stickers","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo129671-e5c58365664b1bc4d715959826109213-640-0.jpg"));
			Product AccesorioPinBeach= productRepository.save(new Product("Pin Lolla Beach",290,"Pin","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo129141-560fbd4d16f89a2fb515959766232294-640-0.jpg"));
			Product AccesorioPinMusic= productRepository.save(new Product("Pin Lolla Music",290,"Pin","",4,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo129081-33d6ad77b44db659db15959764081461-640-0.jpg"));
			Product AccesorioTotebagTieDye= productRepository.save(new Product("Totebag Lolla Tie Dye",690,"ToteBag","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo134671-8d22c7cb12e10dca2015959753603227-640-0.jpg"));
			Product AccesorioTotebagPride= productRepository.save(new Product("Totebag Lolla Pride",690,"ToteBag","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo134601-0d0e4d901de16ea15d15959751809031-640-0.jpg"));
			Product AccesorioTotebagMix= productRepository.save(new Product("Totebag Lolla Mix",690,"ToteBag","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo134741-db1751cdc72351f90e15959747293946-640-0.jpg"));
			Product AccesorioGorraBeach= productRepository.save(new Product("Gorra Lolla Beach",1990.0,"Gorra","",2,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130821-141ed75cd92232fbac15960301098809-640-0.jpg"));
			Product AccesorioGorraRose= productRepository.save(new Product("Gorra Lolla Rose",1790.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo131441-b42de0a5a035565fef15959856674691-640-0.jpg"));
			Product AccesorioGorraBones= productRepository.save(new Product("Gorra Lolla Bones",1990.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130961-2c3c480cdfeed6a10a15959853717937-640-0.jpg"));
			Product AccesorioGorraPride= productRepository.save(new Product("Gorra Lolla Pride",1990.0,"Gorra","",5,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130981-ab01cc33ebf41a9acb15959850187989-640-0.jpg"));
			Product AccesorioGorraLogo= productRepository.save(new Product("Gorra Lolla Logo",1990.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130881-888fedd5de3d64e4b515959849120187-640-0.jpg"));
			Product AccesorioGorraRoundNegra= productRepository.save(new Product("Gorra Lolla Round",1990.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130721-fd0e1d83d7aa12e69215959845507184-640-0.jpg"));
			Product AccesorioGorraMusic= productRepository.save(new Product("Gorra Lolla Music",1990.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130631-83912509c06d136c2815959843857946-640-0.jpg"));
			Product AccesorioRinoneraMixAmarilla= productRepository.save(new Product("Riñonera Lolla Mix Amarilla",990,"Riñonera","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo133751-ca6da3e4148abf744515959836247756-640-0.jpg"));
			Product AccesorioBandoleraMixAmarilla= productRepository.save(new Product("Bandolera Lolla Mix Amarilla",1890.0,"Bandolera","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo133931-43ebdc9d9bce23becd15959831344481-640-0.jpg"));
			Product AccesorioPinYellow= productRepository.save(new Product("Pin Lolla Yellow",290,"Pin","",6,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo129111-4cc57386a86756a35215959765074398-640-0.jpg"));
			Product AccesorioLlaveroVerde= productRepository.save(new Product("Llavero Lolla Mix Verde",390,"Llavero","",40,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo129522-248545abf21099796e15959760036911-640-0.jpg"));
			Product AccesorioLlaveroMixNegro= productRepository.save(new Product("Llavero Lolla Mix Negro",390,"Llavero","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo129551-7313913a5ab590825e15959758574668-640-0.jpg"));
			Product AccesorioBandanaMix= productRepository.save(new Product("Bandana Lolla Mix",590,"Bandana","",30,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo1316811-63783d207f7b9022d115959688526735-640-0.jpg"));
			Product AccesorioBandanaTieDye= productRepository.save(new Product("Bandana Lolla Tie Dye",590,"Bandana","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo132071-79048992da4a78971415959680772089-640-0.jpg"));

			Product AccesorioGorraMusicNegra= productRepository.save(new Product("Gorra Lolla Music Negra",1990.0,"Gorra","",7,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130871-2fc0f5f97855500dd415960301990987-640-0.jpg"));

<<<<<<< HEAD
			Product AccesorioGorraMusicGrey= productRepository.save(new Product("Gorra Lolla Music Grey",1990.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130871-2fc0f5f97855500dd415960301990987-640-0.jpg"));

=======
>>>>>>> 00666c1e28bc0fb2f0a3d2b47e0e1879fa926b75
			Product AccesorioGorraLogoNegra= productRepository.save(new Product("Gorra Lolla Logo Negra",1790.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo131231-339a93be2cc96bb09515959855209067-640-0.jpg"));
			Product AccesorioGorraBonesNegra= productRepository.save(new Product("Gorra Lolla Bones Negra",1990.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo131071-ddafd10587feaea22515959852496531-640-0.jpg"));
			Product AccesorioGorraYellow= productRepository.save(new Product("Gorra Lolla Yellow",1790.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130801-33a84701e73d427bee15959847940202-640-0.jpg"));
			Product AccesorioGorraMultipride= productRepository.save(new Product("Gorra Lolla Multipride",1990.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130751-140abcf6a0301e739415959846626199-640-0.jpg"));
			Product AccesorioRinoneraMixRosa= productRepository.save(new Product("Riñonera Lolla Mix Rosa",990,"Riñonera","",9,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo133471-7865b53aded7acb88915959833950706-640-0.jpg"));
			Product AccesorioBandanaElectric = productRepository.save(new Product("Bandana Lolla Electric",590,"Bandana","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo132051-5ec0c19f37e1184f8d15959652394957-640-0.jpg"));
			Product AccesorioBilleteraMix = productRepository.save(new Product("Billetera Lolla Mix",590,"Billetera","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo1301511-e020edf616b2fd506015959783218989-640-0.jpg"));
			Product AccesorioBilleteraLogoMisc = productRepository.save(new Product("Billetera Lolla Logo Misc",590,"Billetera","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130141-de62e8d31d08752bf115959781795234-640-0.jpg"));
			Product AccesorioBandanaElectricNegro = productRepository.save(new Product("Bandana Lolla Electric Negro",590,"Bandana","",20,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo132051-5ec0c19f37e1184f8d15959652394957-640-0.jpg"));
			Product AccesorioBandanaVioleta = productRepository.save(new Product("Bandana Lolla Violeta",590,"Bandana","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo1320811-946563af5bd8034d3015959677775947-640-0.jpg"));

			Product EcoVasos= productRepository.save(new Product("Vasos Lolla",85,"Vaso","",1000,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/merch_0012_img_1426-removebg-preview-png1-37b10cf9b7236df7cd16080748621512-1024-1024.jpg"));
			Product EcoCuadernoPide= productRepository.save(new Product("Cuaderno Lolla Pide",690,"Cuaderno","",2,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130211-577723abcb9d16f0d115959776348637-640-0.jpg"));
			Product EcoCuadernoLogoMisc= productRepository.save(new Product("Cuaderno Lolla Logo Misc",690,"Cuaderno","",45,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo1301911-6f0937228eb56261d115959775327683-640-0.jpg"));
			Product EcoLapizMix= productRepository.save(new Product("Lapiz Plantable Lolla Mix",150,"Lapiz","",32,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo1294311-811e9d97d08954823515959772724598-640-0.jpg"));
<<<<<<< HEAD
=======

>>>>>>> 00666c1e28bc0fb2f0a3d2b47e0e1879fa926b75



		};
	}
}
