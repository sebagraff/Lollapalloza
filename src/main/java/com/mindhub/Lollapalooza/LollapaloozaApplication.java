package com.mindhub.Lollapalooza;

import com.mindhub.Lollapalooza.models.*;
import com.mindhub.Lollapalooza.repositories.*;
import com.mindhub.Lollapalooza.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class LollapaloozaApplication {
	@Autowired
	PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(LollapaloozaApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(ProductRepository productRepository,
									  EventRepository eventRepository,
									  ClientEventRepository clientEventRepository,
									  LocationRepository locationRepository,
									  MusicBandRepository musicBandRepository,
									  ClientRepository clientRepository,
									  CartRepository cartRepository,
									  TicketRepository ticketRepository,
									  PhotoRepository photoRepository,
									  CommentsRepository commentsRepository){
		return(args) -> {
			//---------------------------------------------------------------Products----------------------------------------
			Product RemeraLogoVibes = productRepository.save(new Product("Remera Lolla Logo Vibes",1890.0,"Remera","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135701-c7f1c684c312f86fb715959866423406-640-0.jpg"));
			Product RemeraBand = productRepository.save(new Product("Remera Lolla Band",1890.0,"Remera","",27,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135291-cd90a76a58b259cf1215959873728285-640-0.jpg"));
			Product RemeraMain = productRepository.save(new Product("Remera Lolla Main",1890.0,"Remera","",93,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135461-581c05db4c94d16eea15959873265224-640-0.jpg"));
			Product RemeraMusic = productRepository.save(new Product("Remera Lolla Music",1890.0,"Remera","",9,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135671-c35bab1e9a71720ecd15959872334113-1024-1024.jpg"));
			Product RemeraMultiPride = productRepository.save(new Product("Remera Lolla Multi Pride",1890.0,"Remera","",50,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135631-10a533a930b3c5ebde15959870535164-1024-1024.jpg"));
			Product RemeraTvSpiral = productRepository.save(new Product("Remera Lolla Tv Spiral",1890.0,"Remera","",50,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135551-15b7cb05c138314ee115959867242967-1024-1024.jpg"));
			Product RemeraHeadphones = productRepository.save(new Product("Remera Lolla Headphones",1890.0,"Remera","",43,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135341-09f44b40bb73fd5e2215959871790968-1024-1024.jpg"));
			Product RemeraShapes = productRepository.save(new Product("Remera Lolla Shapes",1890.0,"Remera","",7,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo135191-032146c6e713b1f28a15959869953160-1024-1024.jpg"));
			Product AccesorioPinLogo= productRepository.save(new Product("Pin Lolla Logo",290,"Pin","",31,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo129211-7391ece38c16a32e3315959768128717-480-0.jpg"));
			Product AccesorioPilusoMixNegro= productRepository.save(new Product("Piluso Lolla Mix Negro",1490.0,"Piluso","",65,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo131541-c3ce36ac30201e480615959840839887-1024-1024.jpg"));
			Product AccesorioMaskMix= productRepository.save(new Product("Lolla Mask Mix",590.0,"Mask","",4,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/seg-foto-accesorio-8-de-julio357661-0d5bf313a118da5e1b15959788940663-1024-1024.jpg"));


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
			Product AccesorioGorraMusicGrey= productRepository.save(new Product("Gorra Lolla Music Grey",1990.0,"Gorra","",100,"https://d2r9epyceweg5n.cloudfront.net/stores/698/172/products/sesion-sin-titulo130871-2fc0f5f97855500dd415960301990987-640-0.jpg"));
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

			//---------------------------------------------------------------Locations----------------------------------------
			Location sede1 = locationRepository.save(new Location("CABA",1000)) ;
			Location sede2 = locationRepository.save(new Location("Rosario",1000)) ;
			Location sede3 = locationRepository.save(new Location("Córdoba",1000)) ;
			Location sede4 = locationRepository.save(new Location("Tucumán",1000)) ;



			//---------------------------------------------------------------Events----------------------------------------
			Event dia1 = eventRepository.save(new Event("JUEVES 27 DE MARZO", sede1));
			Event dia2 = eventRepository.save(new Event("VIERNES 28 DE MARZO",sede2));
			Event dia3 = eventRepository.save(new Event("SABADO 29 DE MARZO",sede3));
			Event dia4 = eventRepository.save(new Event("DOMINGO 30 DE MARZO",sede4));

			//---------------------------------------------------------------Bands----------------------------------------
			MusicBand TravisScott = musicBandRepository.save(new MusicBand("Travis Scott","Hip-hop/rap","22:30","Jacques Berman Webster II, conocido como Travis Scott, es un rapero, compositor y productor musical estadounidense.",dia1,"https://lofficiel.imgix.net/production/cyprus/images/1621507018780729-travis-cover-edited.jpg?w=1920&h=800&fit=clip&crop=edges&auto=%5B%22format%22%2C%20%22compress%22%5D&cs=srgb"));
			MusicBand DUKI = musicBandRepository.save(new MusicBand("DUKI","Trap","18:15","Mauro Ezequiel Lombardo, más conocido como Duki, es un cantante de trap argentino. Es conocido por sus participaciones en El Quinto Escalón",dia1,"https://www.themusicrepublic.es/wp-content/uploads/2021/01/cover_0012_duki_21.jpg"));
			MusicBand WOS = musicBandRepository.save(new MusicBand("WOS","Hip-hop/rap","17:15","Valentín Oliva, conocido por su nombre artístico Wos, es un rapero, freestyler y actor argentino. Wos surgió en la escena de las batallas de rap entre freestylers",dia1,"https://img2.rtve.es/v/5980931?w=1600&preview=1625760451770.jpg"));
			MusicBand Bizarrap = musicBandRepository.save(new MusicBand("Bizarrap","Hip-hop/rap","20:15","Gonzalo Julián Conde, conocido artísticamente como Bizarrap, es un productor musical y DJ argentino. Se especializa en géneros como el trap, la música electrónica y el hip hop.",dia1,"https://cloudfront-us-east-1.images.arcpublishing.com/grupoclarin/PQZYJ56R3FCRFDL2DQDJ6TSYL4.jpg"));

			MusicBand MartinGarrix = musicBandRepository.save(new MusicBand("Martin Garrix","Big room house/Electro house/EDM/Pop","23:45","Martijn Gerard Garritsen, más conocido como Martin Garrix, es un DJ y productor neerlandés fundador del sello STMPD RCRDS.",dia2,"https://finestofedm.com/wp-content/uploads/2019/05/Martin-Garrix-Injures-Ankle-At-Recent-Show-Ends-Set-to-Seek-Medical-Attention.jpg"));
			MusicBand RatonesParanoicos = musicBandRepository.save(new MusicBand("Ratones Paranoicos","Rock","19:00","Ratones Paranoicos es una banda de rock argentino, formada el 14 de octubre de 1983 en el barrio de Villa Devoto, Buenos Aires. Originalmente estaba formada por Juan Sebastián Gutiérrez Juanse, Pablo “Maldito Memi, Pablo Sarcófago Cano, Rubén Roy Quiroga",dia2,"https://arc-anglerfish-arc2-prod-copesa.s3.amazonaws.com/public/NXBD2HD6RVBLTMU7ACXVTXDCLA.jpg"));
			MusicBand ArminVanBuuren  = musicBandRepository.save(new MusicBand("Armin Van Buuren ","House progresivo/Electro house/Dance pop","23:45","Armin Jozef Jacobus Daniël van Buuren es un DJ y productor discográfico neerlandés.",dia2,"https://djmag.com/sites/default/files/styles/djmag_landscape__691x372_/public/article/image/armin-van-buuren-asot-850-anthem-2018%20%281%29.png?itok=5UkkQQmB"));
			MusicBand Emilia = musicBandRepository.save(new MusicBand("Emilia","Pop/Reggaeton","15:15","María Emilia Mernes Rueda, conocida como Emilia Mernes o simplemente Emilia, es una cantante, compositora, modelo y actriz argentina.",dia2,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcMPI3s9cVDY7J221HG-DpI2s2XHs4_mGoAg&usqp=CAU"));

			MusicBand AlanWalker = musicBandRepository.save(new MusicBand("Alan Walker","Deep house/Dance/Electronica","23:30","Alan Olav Walker es un DJ, compositor y productor discográfico británico-noruego.",dia3,"https://www.cultr.com/wp-content/uploads/2019/12/wp3276976.jpg"));
			MusicBand Trueno = musicBandRepository.save(new MusicBand("Trueno","Hip-hop/rap","15:30","Mateo Palacios Corazzina, más conocido por su nombre artístico Trueno, es un rapero y freestyler argentino.",dia3,"https://i2.wp.com/elestilolibre.com/wp-content/uploads/2020/08/2-Trueno-diferencias-batalla.jpg?resize=650%2C350&ssl=1"));
			MusicBand JadenSmith = musicBandRepository.save(new MusicBand("Jaden Smith","Hip-hop/rap","19:45","Jaden Christopher Syre Smith es un actor y rapero estadounidense.",dia3,"https://www.pe.com/wp-content/uploads/2019/04/RPE-L-CF-Jaden-0412.dk_.03-2.jpg"));
			MusicBand Airbag = musicBandRepository.save(new MusicBand("Airbag","Rock","16:45","Airbag es una banda argentina de hard rock formada en Buenos Aires",dia3,"https://www.cmtv.com.ar/imagenes_artistas/3.jpg?Airbag"));

			MusicBand LanadelRey = musicBandRepository.save(new MusicBand("Lana del Rey","Indie rock","19:45","Elizabeth Woolridge Grant, conocida por su nombre artístico Lana del Rey, es una cantante, compositora, modelo y productora estadounidense.",dia4,"https://www.rockandpop.cl/wp-content/uploads/2019/01/lana-del-rey-live-may-20-2017-billboard-1548.jpg"));
			MusicBand YSYA = musicBandRepository.save(new MusicBand("YSY A","Trap","17:30","Alejo Nahuel Acosta Migliarini, conocido artísticamente como tirdy, es un rapero, compositor, productor discográfico y freestyler argentino, principalmente del género del trap.",dia4,"https://billboard.com.ar/wp-content/uploads/2019/10/Ysy-A-en-el-Teatro-Vorterix.-Gentileza-Circulo-Virtuoso-1..jpg"));
			MusicBand SanHolo = musicBandRepository.save(new MusicBand("San Holo","Dance/Electrónica","20:00","Sander van Dijck, mejor conocido por su nombre artístico San Holo, es un DJ, músico, compositor y productor neerlandés.",dia4,"https://aestheticmag.files.wordpress.com/2016/08/san-holo-3-of-15-copy.jpg?w=750"));
			MusicBand Rezz = musicBandRepository.save(new MusicBand("Rezz","Dance/electrónica/Techno","22:30","Isabelle Rezazadeh, más conocida por su nombre artístico Rezz, es una DJ y productora musical canadiense, proveniente de Niagara Falls, Ontario.",dia4,"https://allmusicspain.com/wp-content/uploads/2018/07/rezz-1500283305.81.2560x1440.jpeg"));


			Client client =	new Client("jorgito", passwordEncoder.encode("123"));
			Client client1 =new Client("carlitos", passwordEncoder.encode("123"));
			Client client2 =new Client("maria", passwordEncoder.encode("123"));
			Client client3 =new Client("juanita", passwordEncoder.encode("123"));
			Client client4 =new Client("romina", passwordEncoder.encode("123"));


			Cart newCart = cartRepository.save(new Cart());
			client.setCart(newCart);

			Cart newCart1 = cartRepository.save(new Cart());
			client1.setCart(newCart1);

			Cart newCart2 = cartRepository.save(new Cart());
			client2.setCart(newCart2);

			Cart newCart3 = cartRepository.save(new Cart());
			client3.setCart(newCart3);

			Cart newCart4 = cartRepository.save(new Cart());
			client4.setCart(newCart4);
			clientRepository.save(client2);
			clientRepository.save(client3);
			clientRepository.save(client4);
			clientRepository.save(client1);
			clientRepository.save(client);
//
			Ticket ticket1 = new Ticket(5000, dia1.getDate(), MyUtils.getRandomNumber(1,10000),client,sede1.getName());
			Ticket ticket2 = new Ticket(5000, dia2.getDate(), MyUtils.getRandomNumber(1,10000),client,sede2.getName());
			Ticket ticket3 = new Ticket(5000, dia3.getDate(), MyUtils.getRandomNumber(1,10000),client, sede3.getName());
			Ticket ticket4 = new Ticket(5000, dia4.getDate(), MyUtils.getRandomNumber(1,10000),client, sede4.getName());
			Ticket ticketFull = new Ticket(11500, dia1.getDate() + ", " + dia2.getDate() + ", " + dia3.getDate() + ", " + dia4.getDate(), MyUtils.getRandomNumber(1,10000),client, sede1.getName() + ", " + sede2.getName() + ", " + sede3.getName() + " y " + sede4.getName());
			Ticket ticket12 = new Ticket(9000,    dia1.getDate() + ", " + dia2.getDate(),MyUtils.getRandomNumber(1,10000),client, sede1.getName() + " y " + sede2.getName());
			Ticket ticket34 = new Ticket(9000,    dia2.getDate() + ", " + dia3.getDate(),MyUtils.getRandomNumber(1,10000),client, sede3.getName()+ " y " + sede4.getName());
			ticketRepository.save(ticket1);
			ticketRepository.save(ticket2);
			ticketRepository.save(ticket3);
			ticketRepository.save(ticket4);
			ticketRepository.save(ticketFull);
			ticketRepository.save(ticket12);
			ticketRepository.save(ticket34);

//			Photo testphoto = new Photo("Titulo","url","descripcion");
//			photoRepository.save(testphoto);
//
//			Comment testcomment = new Comment("descript", client.getUser(), client, testphoto);
//			commentsRepository.save(testcomment);

			Photo photo1 = new Photo("Lenny Kravitz","https://s3.amazonaws.com/arc-wordpress-client-uploads/infobae-wp/wp-content/uploads/2019/03/31221612/Lollapalooza-2019-Dia-3-Domingo-Lenny-Kravitz-39.jpg","Lenny Kravitz en el Lolla del 2019");
			photoRepository.save(photo1);

			Photo photo2 = new Photo("Dj Tiesto","https://i.ytimg.com/vi/eTGKyjCBVBU/hqdefault.jpg","Dj Tiesto en el Lolla del 2019");
			photoRepository.save(photo2);

			Photo photo3 = new Photo("LineUp 2019","https://i.ytimg.com/vi/N6s3keuNIGI/maxresdefault.jpg","Este fue el LineUp de 2019, agradecemos a todas las bandas");
			photoRepository.save(photo3);

			Photo photo4 = new Photo("Yeeahhhhh","https://sp-ao.shortpixel.ai/client/q_glossy,ret_img,w_750,h_663/http://mibuenosairesquerido.com/wp-content/uploads/2018/09/LOLLA_AR2017_0331_123157_3046_ALIVECOVERAGE.jpg","Lista la previa!");
			photoRepository.save(photo4);

			Photo photo5 = new Photo("Espiritu verde","https://www.elfederal.com.ar/wp-content/uploads/2019/04/domo-cesped-lollapalooza-espiritu-verde-matilde-moyano-el-federal.jpg","el espacio 'Espíritu Verde' del festival Lollapalooza Argentina 2019");
			photoRepository.save(photo5);

			Photo photo6 = new Photo("Cuidemos el planeta","https://www.elfederal.com.ar/wp-content/uploads/2019/04/rock-and-recycle-lollapalooza-el-federal.jpg","Colaboremos entre todos! Recuerden que hay espacios para reciclar");
			photoRepository.save(photo6);

			Photo photo7 = new Photo("LolaPalloza Argentina","https://cdn2www.mundo.com/fotos/201807/tiyu-600x400.jpg",";)");
			photoRepository.save(photo7);

			Photo photo8 = new Photo("La Mona Gimenez","https://indiehoy.com/wp-content/uploads/2019/04/36-mona_lollapalooza_dia1_matiascasalh-1.jpg","Quien se ha tomado todo el vino, oh oh oh oh oh oh");
			photoRepository.save(photo8);

			Photo photo9 = new Photo("Campo","https://video-images.vice.com/_uncategorized/1554137953044-color_lollapalooza_dia3_matiascasalh-11.jpeg","Foto de campo");
			photoRepository.save(photo9);

			Photo photo10 = new Photo("Patio de comidas","https://s3.amazonaws.com/arc-wordpress-client-uploads/infobae-wp/wp-content/uploads/2019/03/31152342/Lollapalooza-Dia-3-Gastronomia-2.jpg","Empanadas de colores y helados veganos: las estrellas gourmet del Lollapalooza 2019");
			photoRepository.save(photo10);


			Comment comment1 = new Comment("Excelente", client.getUser(), client, photo1);
			commentsRepository.save(comment1);

			Comment comment2 = new Comment("Estuve ahi", client2.getUser(), client2, photo1);
			commentsRepository.save(comment2);

			Comment comment3 = new Comment("Que te parecio jorgito?", client3.getUser(), client3, photo1);
			commentsRepository.save(comment3);

			Comment comment4 = new Comment("Alta fiesta", client.getUser(), client, photo1);
			commentsRepository.save(comment4);

			Comment comment5 = new Comment("Buenisimo", client.getUser(), client, photo2);
			commentsRepository.save(comment5);

			Comment comment6 = new Comment("como extraño ese dia", client4.getUser(), client4, photo2);
			commentsRepository.save(comment6);

			Comment comment7 = new Comment("la pasamos bomba", client3.getUser(), client3, photo2);
			commentsRepository.save(comment7);

			Comment comment8 = new Comment("Fiiiiieeestaaaa", client.getUser(), client, photo3);
			commentsRepository.save(comment8);

			Comment comment9 = new Comment("eeeesaaaaaaa", client2.getUser(), client2, photo4);
			commentsRepository.save(comment9);


		};
	}
}
